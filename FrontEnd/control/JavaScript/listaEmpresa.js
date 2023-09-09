import { getData } from "./GoogleSheetDataBase.js";
const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec";
function logarEmpresa() {
    const datanotfound = true;
    const data = getData(url, "jobs");
    const listaDiv = document.getElementById("lista");
    data.forEach((element) => {
        const listContent = document.createElement("div");
        listContent.className = 'candidato';
        listContent.innerHTML = `
    
    <div class="user-info">

        <div class="image-container">
        <img src="https://robohash.org/${element[2]}" alt="Avatar">
        </div>
        
        <div class="div-name">
            <label class="info-title">Nome:</label><br>
            <label>${element[0]}</label><br>
        </div>
        
        <div class="div-email">
            <label class="info-title">Email:</label><br>
            <label>${element[1]}</label>
        </div>
        
        <div>
            <label class="info-title">CNPJ:</label><br>
            <label>${element[2]}</label>
        </div>

        <div>
            <label class="info-title">Pais:</label><br>
            <label>${element[3]}</label>
        </div>
        

        <div>
            <label class="info-title">CEP:</label><br>
            <label>${element[4]}</label>
        </div>

    </div>

    <div class="user-desc">
        <label class="info-title">Descrição:</label>
        <p>${element[6]}</p>
    </div>`;
        listaDiv.appendChild(listContent);
    });
}
logarEmpresa();
