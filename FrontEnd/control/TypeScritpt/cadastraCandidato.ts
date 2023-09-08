import { appendRow } from  "./GoogleSheetDataBase.js";

const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec"


document.addEventListener("DOMContentLoaded", () => {
    const botao = document.getElementById("cadastrar");
    if (botao) {
      botao.addEventListener("click", cadastrarCandidato);
    }
  });

function cadastrarCandidato() :void{
  
    const nome = document.getElementById("Nome") as HTMLInputElement;
    const email = document.getElementById("Email") as HTMLInputElement;
    const cpf = document.getElementById("CPF") as HTMLInputElement;
    const idade = document.getElementById("Idade") as HTMLInputElement;
    const estado = document.getElementById("Estado") as HTMLInputElement;
    const cep = document.getElementById("CEP") as HTMLInputElement;
    const comp = document.getElementById("comp") as HTMLInputElement;
    const descricao = document.getElementById("descPessoal") as HTMLInputElement;

    appendRow([nome.value, email.value, "x"+cpf.value, idade.value, estado.value, cep.value, String(comp.value).replace(",","$"), descricao.value], url, "candidates");
    
    setTimeout(function() {
      const confirmacao = confirm("Candidato cadastrada com sucesso! Clique em OK para ir para a página de login.");
  
      if (confirmacao) {
          window.location.href = "../Login/login_candidato.html";
      }
     }, 1000);
}

