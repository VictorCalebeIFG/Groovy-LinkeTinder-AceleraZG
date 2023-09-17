export function checkNome(nome) {
    const regExp = /^[A-Za-z\s']+$/;
    return regExp.test(nome);
}
export function checkEmail(email) {
    const regExp = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regExp.test(email);
}
export function checkCPF(cpf) {
    const regExp = /^[0-9]+$/;
    return regExp.test(cpf);
}
export function checkIdade() {
    const idade = document.getElementById("Idade");
    const regExp = /^[0-9]+$/;
    return regExp.test(idade.value);
}
export function checkNumero(numero) {
    const regExp = /^[0-9]+$/;
    return regExp.test(numero);
}
export function checkLinkedin(link) {
    const regExp = /^(https?:\/\/[^\s/$.?#].[^\s]*)$/i;
    return regExp.test(link);
}
export function checkTags(tags) {
    const regExp = /^(PYTHON|JAVA|JAVASCRIPT|HTML|CSS)(,(PYTHON|JAVA|JAVASCRIPT|HTML|CSS))*$/;
    return regExp.test(tags);
}
