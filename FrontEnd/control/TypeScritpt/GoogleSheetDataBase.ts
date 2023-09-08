
export async function appendRow(data:string[],url:string,worksheet:string){
    url = `${url}?action=append&data=${data.join(',')}&wkname=${worksheet}`;
    const response = await fetch(url);
}

export function getData(url: string, worksheet: string): any[] {
    url = `${url}?action=getdata&wkname=${worksheet}`;
    const Httpreq = new XMLHttpRequest();
    Httpreq.open("GET", url, false);

    Httpreq.send(null);
    const data = JSON.parse(Httpreq.responseText);
    return data;
}

export function findRowByCNPJ(cnpj: string, url: string, worksheet: string): any | undefined {
    const data = getData(url, worksheet);
    console.log(data);
    const foundElement = data.find((element: any) => element[2] === cnpj);
    
    return foundElement; 
}
