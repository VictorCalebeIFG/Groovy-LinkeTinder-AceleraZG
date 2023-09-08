import { findRowByCNPJ } from "./GoogleSheetDataBase.js";
const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec";
const urlParams = new URLSearchParams(window.location.search);
const cnpj = urlParams.get('username');
const helloDiv = document.getElementById("hello-user");
if (cnpj) {
    const data = findRowByCNPJ(cnpj, url, "company");
    console.log(data);
    helloDiv.innerHTML = `<img src="https://robohash.org/${data[0]}" alt="Avatar" style="border-radius: 50%; width: 100px">Olá, ${data[0]}!`;
}
