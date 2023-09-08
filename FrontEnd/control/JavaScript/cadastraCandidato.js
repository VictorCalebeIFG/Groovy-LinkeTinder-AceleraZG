import { appendRow } from "./GoogleSheetDataBase.js";
const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec";
document.addEventListener("DOMContentLoaded", () => {
    const botao = document.getElementById("cadastrar");
    if (botao) {
        botao.addEventListener("click", cadastrarCandidato);
    }
});
function cadastrarCandidato() {
    const nome = document.getElementById("Nome");
    const email = document.getElementById("Email");
    const cpf = document.getElementById("CPF");
    const idade = document.getElementById("Idade");
    const estado = document.getElementById("Estado");
    const cep = document.getElementById("CEP");
    const comp = document.getElementById("comp");
    const descricao = document.getElementById("descPessoal");
    const password = document.getElementById("password");
    appendRow([nome.value, email.value, "x" + cpf.value, idade.value, estado.value, cep.value, String(comp.value).replace(",", "$"), descricao.value, password.value], url, "candidates");
    setTimeout(function () {
        const confirmacao = confirm("Candidato cadastrada com sucesso! Clique em OK para ir para a página de login.");
        if (confirmacao) {
            window.location.href = "../Login/login_candidato.html";
        }
    }, 1000);
}
