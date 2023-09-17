export function checkNome(nome:string):boolean{
    const regExp = /^[A-Za-z\s']+$/;
    return regExp.test(nome);
}

export function checkEmail(email:string):boolean{
    const regExp =  /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regExp.test(email);
}

export function checkCPF(cpf:string):boolean{
    const regExp = /^[0-9]+$/;
    return regExp.test(cpf);
}

export function checkIdade():boolean{
    const idade = document.getElementById("Idade") as HTMLInputElement;
    const regExp = /^[0-9]+$/;
    return regExp.test(idade.value);
}


export function checkNumero(numero:string):boolean{
    const regExp = /^[0-9]+$/;
    return regExp.test(numero);
}

export function checkLinkedin(link:string):boolean {
    const regExp = /^(https?:\/\/[^\s/$.?#].[^\s]*)$/i;
    return regExp.test(link);
}

export function checkTags(tags:string):boolean{
    const regExp = /^(PYTHON|JAVA|JAVASCRIPT|HTML|CSS)(,(PYTHON|JAVA|JAVASCRIPT|HTML|CSS))*$/
    return regExp.test(tags);
}