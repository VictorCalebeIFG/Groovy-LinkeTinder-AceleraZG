import fetch from 'node-fetch';

export async function appendRow(data:string[],url:string,worksheet:string){
    url = `${url}?action=append&data=${data.join(',')}&wkname=${worksheet}`;
    const response = await fetch(url);
}