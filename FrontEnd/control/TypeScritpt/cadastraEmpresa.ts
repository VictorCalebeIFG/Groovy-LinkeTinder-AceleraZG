import { appendRow } from  "./GoogleSheetDataBase";

const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec"

function adicionarEmpresa() :void{
    const empresa = document.getElementById("empresa") as HTMLInputElement;
    const email = document.getElementById("email") as HTMLInputElement;
    const cnpj = document.getElementById("cnpj") as HTMLInputElement;
    const pais = document.getElementById("pais") as HTMLInputElement;
    const estado = document.getElementById("estado") as HTMLInputElement;
    const cep = document.getElementById("cep") as HTMLInputElement;
    const descricao = document.getElementById("descricao") as HTMLInputElement;

    appendRow([empresa.value, email.value, cnpj.value, pais.value, estado.value, cep.value, descricao.value], url, "company");
    alert("Empresa cadastrada com sucesso!");
}