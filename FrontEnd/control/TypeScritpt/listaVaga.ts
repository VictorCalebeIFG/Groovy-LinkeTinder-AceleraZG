import { getData } from "./GoogleSheetDataBase.js";
import { findRowByCNPJnoRequest } from "./GoogleSheetDataBase.js";

export const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec"

export function logarEmpresa(): void {
    // const datanotfound = true; // This variable is not used
    const jobData = getData(url, "jobs");
    const empresaData = getData(url, "company");

    const listaDiv = document.getElementById("lista") as HTMLDivElement;

    jobData.forEach((element: any) => {
        const listContent = document.createElement("div");
        
        listContent.className = 'candidato';

        const empresa = findRowByCNPJnoRequest(element[0], empresaData);

        console.log(empresa);

        listContent.innerHTML = `
    
        <div class="user-info">
    
            <div class="image-container">
            <img src="https://robohash.org/${element[0]}" alt="Avatar">
            </div>
            
            <div class="div-name">
                <label class="info-title">Empresa:</label><br>
                <label>${empresa[0]}</label><br>
            </div>
            
            <div class="div-email">
                <label class="info-title">Email:</label><br>
                <label>${empresa[1]}</label>
            </div>
            
            <div>
                <label class="info-title">Cargo:</label><br>
                <label>${element[1]}</label>
            </div>
    
            <div>
                <label class="info-title">Skills:</label><br>
                <label>${String(element[2]).replace("$", ",")}</label>
            </div>
            

    
        </div>
    
        <div class="user-desc">
            <label class="info-title">Descrição da Vaga:</label>
            <p>${element[3]}</p>
        </div>`;

        listaDiv.appendChild(listContent);

    })
}

logarEmpresa();