import { appendRow } from  "./GoogleSheetDataBase.js";
import { checkNome,checkCPF,checkNumero,checkLinkedin,checkTags, checkEmail} from  "./cadastroValidation.js";

const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec"


document.addEventListener("DOMContentLoaded", () => {
    const botao = document.getElementById("cadastrar");
    if (botao) {
      botao.addEventListener("click", adicionarEmpresa);
    }
  });

function adicionarEmpresa() :void{

    const empresa   = document.getElementById("Nome")           as HTMLInputElement;
    const email     = document.getElementById("Email")          as HTMLInputElement;
    const cnpj      = document.getElementById("CNPJ")           as HTMLInputElement;
    const pais      = document.getElementById("Pais")           as HTMLInputElement;
    const estado    = document.getElementById("CEP")            as HTMLInputElement;
    const cep       = document.getElementById("password")       as HTMLInputElement;
    const descricao = document.getElementById("descPessoal")    as HTMLInputElement;

    if(checkNumero(cnpj.value) && checkNome(empresa.value) && checkEmail(email.value) && checkNumero(cep.value)){
      appendRow([empresa.value, email.value, `x${String(cnpj.value)}`, pais.value, estado.value, cep.value, descricao.value], url, "company");
    
      setTimeout(function() {
        const confirmacao = confirm("Empresa cadastrada com sucesso! Clique em OK para ir para a página de login.");
    
        if (confirmacao) {
            window.location.href = "../Login/login_empresa.html";
        }
      }, 1000);
    }else{
      alert(`
      CNPJ:${checkNumero(cnpj.value)}
      Nome:${checkNome(empresa.value)}
      Email:${checkEmail(email.value)}
      CEP:${checkNumero(cep.value)}`);
    }
    
}

