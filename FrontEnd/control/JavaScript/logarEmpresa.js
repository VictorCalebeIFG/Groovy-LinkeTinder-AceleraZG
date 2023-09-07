import { getData } from "./GoogleSheetDataBase.js";
const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec";
document.addEventListener("DOMContentLoaded", () => {
    const botao = document.getElementById("logar");
    if (botao) {
        botao.addEventListener("click", logarEmpresa);
    }
});
function logarEmpresa() {
    const datanotfound = true;
    var senha;
    var cnpj;
    const CNPJ = document.getElementById("CNPJ");
    const SENHA = document.getElementById("Senha");
    const data = getData(url, "company");
    data.forEach((element) => {
        senha = element[5];
        cnpj = element[2];
        if (CNPJ.value == cnpj && SENHA.value == senha) {
            window.location.href = "empresa_hub.html?username=" + cnpj;
        }
    });
    console.log(cnpj, senha);
}
