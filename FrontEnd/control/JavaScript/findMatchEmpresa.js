import { getData } from "./GoogleSheetDataBase.js";
export const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec";
const urlParams = new URLSearchParams(window.location.search);
const user = urlParams.get('username');
const empData = getData(url, "EmpresaLike");
const candData = getData(url, "CandidatoLike");
var match = [];
candData.forEach((candLike) => {
    empData.forEach((empLike) => {
        if (candLike[0] == empLike[0] && candLike[1] == empLike[1]) {
            match.push(candLike);
            return;
        }
    });
});
console.log(match);
const seuMatch = [];
match.forEach((m) => {
    if (m[1] == user) {
        seuMatch.push(m);
    }
});
console.log(seuMatch);
const matchDiv = document.getElementById("userMatch");
seuMatch.forEach((m) => {
    var divElement = document.createElement("div");
    divElement.innerHTML = m.join(" - ");
    matchDiv.appendChild(divElement);
});
