import { appendRow } from  "./GoogleSheetDataBase.js";

const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec"


document.addEventListener("DOMContentLoaded", () => {
    const botao = document.getElementById("cadastrarVaga");
    if (botao) {
      botao.addEventListener("click", cadastrarVaga);
    }
  });

function cadastrarVaga() :void{

    const nomeVaga   = document.getElementById("Nome")           as HTMLInputElement;
    const skills     = document.getElementById("Skills")         as HTMLInputElement;
    const desc       = document.getElementById("Desc")           as HTMLInputElement;

    const urlParams = new URLSearchParams(window.location.search);
    const username = urlParams.get('username');

    if(username){
      appendRow([username,nomeVaga.value,  String(skills.value).replace(",","$"), desc.value,generateRandomValue()], url, "jobs");
    }
    
    setTimeout(function() {
      const confirmacao = confirm("Vaga cadastrada com sucesso! Clique em OK para ir para o hub da empresa.");
  
      if (confirmacao) {
          window.location.href = "../Hub/empresa_hub.html?username=" + username;
      }
     }, 1000);
}

function generateRandomValue(): string {
  const min = 0;
  const max = 9999999999; // 10 dígitos
  const randomNumber = Math.floor(Math.random() * (max - min + 1)) + min;
  const randomNumberStr = randomNumber.toString();
  const zeroPadding = '0'.repeat(10 - randomNumberStr.length); // Adiciona zeros à esquerda
  const formattedValue = `x${zeroPadding}${randomNumberStr}`;
  return formattedValue;
}