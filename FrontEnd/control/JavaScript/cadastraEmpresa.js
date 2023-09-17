import { appendRow } from "./GoogleSheetDataBase.js";
import { checkNome, checkNumero, checkEmail } from "./cadastroValidation.js";
const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec";
document.addEventListener("DOMContentLoaded", () => {
    const botao = document.getElementById("cadastrar");
    if (botao) {
        botao.addEventListener("click", adicionarEmpresa);
    }
});
function adicionarEmpresa() {
    const empresa = document.getElementById("Nome");
    const email = document.getElementById("Email");
    const cnpj = document.getElementById("CNPJ");
    const pais = document.getElementById("Pais");
    const estado = document.getElementById("CEP");
    const cep = document.getElementById("password");
    const descricao = document.getElementById("descPessoal");
    if (checkNumero(cnpj.value) && checkNome(empresa.value) && checkEmail(email.value) && checkNumero(cep.value)) {
        appendRow([empresa.value, email.value, `x${String(cnpj.value)}`, pais.value, estado.value, cep.value, descricao.value], url, "company");
        setTimeout(function () {
            const confirmacao = confirm("Empresa cadastrada com sucesso! Clique em OK para ir para a página de login.");
            if (confirmacao) {
                window.location.href = "../Login/login_empresa.html";
            }
        }, 1000);
    }
    else {
        alert(`
      CNPJ:${checkNumero(cnpj.value)}
      Nome:${checkNome(empresa.value)}
      Email:${checkEmail(email.value)}
      CEP:${checkNumero(cep.value)}`);
    }
}
