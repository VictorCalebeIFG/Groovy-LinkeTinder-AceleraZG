import { getData } from  "./GoogleSheetDataBase.js";

const url = "https://script.google.com/macros/s/AKfycbwvNd0cLSh10QPaoVD9KIfqwzeAOjXWHo9Egk8DcbDrwTZE_nCLhbvca-AJ3KiBB9Rz/exec"


function getStatistics() {
    const data = getData(url, "candidates");
    let skillData: any[] = [];

    const totalCandidates = data.length;
    data.forEach((skill: any) => {
        skillData = skillData.concat(skill[6].split('$'))
    })

    //Python[0] , Java[1] , JavaScript[2] , HTML[3] , CSS[4]

   const dataTypes =  ["PYTHON", "JAVA", "JAVASCRIPT", "HTML", "CSS"]

   let count = 0
   let countData: any[] = []

   dataTypes.forEach((type) => {
       skillData.forEach((skill) => {
           if (skill == type) {
               count += 1
           }
       })
       countData.push(count*100/skillData.length)
       count = 0
   })

   const heightfix = 1.4

   const pythonBar = document.getElementById("python") as HTMLDivElement;
   const pythonText = document.getElementById("textPython") as HTMLSpanElement
   pythonBar.style.height = `${countData[0]*heightfix}%`
   pythonText.innerHTML = `${countData[0].toFixed(2)}%`
   

   const javaBar = document.getElementById("java") as HTMLDivElement;
   const javaText = document.getElementById("textJava") as HTMLSpanElement

   javaBar.style.height = `${countData[1]*heightfix}%`
   javaText.innerHTML = `${countData[1].toFixed(2)}%`

   const javascriptBar = document.getElementById("javascript") as HTMLDivElement;
   const javascriptText = document.getElementById("textJavascript") as HTMLSpanElement
   javascriptBar.style.height = `${countData[2]*heightfix}%`
   javascriptText.innerHTML = `${countData[2].toFixed(2)}%`

   const htmlBar = document.getElementById("html") as HTMLDivElement;
   const htmlText = document.getElementById("textHtml") as HTMLSpanElement
   htmlBar.style.height = `${countData[3]*heightfix}%`
   htmlText.innerHTML = `${countData[3].toFixed(2)}%`

   const cssBar = document.getElementById("css") as HTMLDivElement;
   const cssText = document.getElementById("textCss") as HTMLSpanElement
   cssBar.style.height = `${countData[4]*heightfix}%`
   cssText.innerHTML = `${countData[4].toFixed(2)}%`


}

getStatistics()