function clicked() {
    let x = document.getElementById("text");
    if (x.innerHTML === "ON") {
        x.innerHTML = "OFF";
    } else {
        x.innerHTML = "ON";
    }
}