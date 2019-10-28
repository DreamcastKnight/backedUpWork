var a = document.getElementById("num1");
var b = document.getElementById("num2");
var x = document.getElementById("result");
var z = document.getElementById("prevresult");

function add() {
    z.innerHTML = x.innerHTML;
    x.innerHTML = parseFloat(a.value) + parseFloat(b.value);
    operator = "+";
    resLog();
}
function subtract() {
    z.innerHTML = x.innerHTML;
    x.innerHTML = parseFloat(a.value) - parseFloat(b.value);
    operator = "-";
    resLog();
}
function multiply() {
    z.innerHTML = x.innerHTML;
    x.innerHTML = parseFloat(a.value) * parseFloat(b.value);
    operator = "*";
    resLog();
}
function divide() {
    z.innerHTML = x.innerHTML;
    x.innerHTML = parseFloat(a.value) / parseFloat(b.value);
    operator = "/";
    resLog();
}
function reset() {
    z.innerHTML = x.innerHTML;
    x.innerHTML = 0;
}
function resLog() {
    let h = document.getElementById("result");
    let newRes = document.createElement('p')
    newRes.innerText = a.value + operator + b.value + "=" + h.innerHTML;
    document.body.appendChild(newRes);
}