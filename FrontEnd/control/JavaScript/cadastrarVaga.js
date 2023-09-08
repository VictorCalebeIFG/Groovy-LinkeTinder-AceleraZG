import { appendRow } from "./GoogleSheetDataBase.js";
const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec";
document.addEventListener("DOMContentLoaded", () => {
    const botao = document.getElementById("cadastrarVaga");
    if (botao) {
        botao.addEventListener("click", cadastrarVaga);
    }
});
function cadastrarVaga() {
    const nomeVaga = document.getElementById("Nome");
    const skills = document.getElementById("Skills");
    const desc = document.getElementById("Desc");
    const urlParams = new URLSearchParams(window.location.search);
    const username = urlParams.get('username');
    if (username) {
        appendRow([username, nomeVaga.value, skills.value, desc.value], url, "jobs");
    }
    setTimeout(function () {
        const confirmacao = confirm("Vaga cadastrada com sucesso! Clique em OK para ir para a página de login.");
        if (confirmacao) {
            window.location.href = "../Hub/empresa_hub.html?username=" + username;
        }
    }, 1000);
}
