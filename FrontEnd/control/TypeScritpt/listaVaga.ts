import { getData } from "./GoogleSheetDataBase.js";
import { appendRow } from "./GoogleSheetDataBase.js";
import { findRowByCNPJnoRequest } from "./GoogleSheetDataBase.js";

export const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec"

const globalJobData = getData(url, "jobs");
const globalEmpresaData = getData(url, "company");

const urlParams = new URLSearchParams(window.location.search);
const user = urlParams.get('username');

var vagaPos: number = 0;

const likebutton = document.getElementById('like');
const closeButton = document.getElementById('close');

if (likebutton && closeButton) {
    likebutton.addEventListener('click', proximaVaga);
    closeButton.addEventListener('click', ignoreVaga);
}

function ignoreVaga():void {
    vagaPos += 1;
    if(vagaPos >= globalJobData.length){
        vagaPos = 0;
    }
    loadHtmlNextJob();
}

function proximaVaga(): void{
    vagaPos += 1;
    appendRow([user,globalJobData[vagaPos][0],globalJobData[vagaPos][4]], url, "CandidatoLike");
    if(vagaPos >= globalJobData.length){
        vagaPos = 0;
    }
    
    loadHtmlNextJob();
}

function loadHtmlNextJob():void{
    const nomeVaga = document.getElementById("nomeVaga") as HTMLInputElement;
    const skills = document.getElementById("skills") as HTMLInputElement;
    const desc = document.getElementById("descricao") as HTMLInputElement;


    nomeVaga.innerHTML = globalJobData[vagaPos][1];
    skills.innerHTML = globalJobData[vagaPos][2].replace("$", ",");
    desc.innerHTML = globalJobData[vagaPos][3];
}

loadHtmlNextJob();