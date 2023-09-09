var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
export function appendRow(data, url, worksheet) {
    return __awaiter(this, void 0, void 0, function* () {
        url = `${url}?action=append&data=${data.join(',')}&wkname=${worksheet}`;
        const response = yield fetch(url);
    });
}
export function getData(url, worksheet) {
    url = `${url}?action=getdata&wkname=${worksheet}`;
    const Httpreq = new XMLHttpRequest();
    Httpreq.open("GET", url, false);
    Httpreq.send(null);
    const data = JSON.parse(Httpreq.responseText);
    return data;
}
export function findRowByCNPJ(cnpj, url, worksheet) {
    const data = getData(url, worksheet);
    console.log(data);
    const foundElement = data.find((element) => element[2] === cnpj);
    return foundElement;
}
export function findRowByCNPJnoRequest(cnpj, data) {
    console.log(data);
    const foundElement = data.find((element) => element[2] === cnpj);
    return foundElement;
}
