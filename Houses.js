const xhr = new XMLHttpRequest();
// xhr.onload = () => output(xhr.responseText);
xhr.onload = () => console.log(xhr.responseText);
xhr.open('GET', "https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/kings.json");
//xhr.setRequestHeader("Content-Type","application/json");
xhr.send();

let data;
function output(text){
    data=JSON.parse(text);
    let el= document.createElement('p');
    el.innerText=data;
    document.getElementById("main").appendChild(el);
}