const xhr = new XMLHttpRequest();
xhr.onload = () => output(xhr.responseText);
xhr.open('GET', "https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/example.json");
xhr.send();

let data;
let main = document.getElementById("main");

function output(text) {
    data = JSON.parse(text);
    let sQ = document.createElement('div');
    sQ.className = "card";
    let title = document.createElement('h3');
    title.innerText = data.sQName;
    title.className = "card-title";
    sQ.appendChild(title).style.fontSize = "xx-large";
    let el = document.createElement('p');
    el.innerText = "Active: " + data.active + "\n"
        + " Formed: " + data.formed + "\n"
        + " Home Town: " + data.homeTown + "\n"
        + " Secret Base: " + data.secretBase;
    sQ.appendChild(el);
    main.appendChild(sQ);
    printMembers(data);
}

function printMembers({ members }) {
    members.forEach(m => {
        let member = document.createElement('div');
        member.className = "card";
        let p = document.createElement('p');
        let name = document.createElement('h3');
        name.innerText = m.name;
        member.appendChild(name).style.fontSize = "x-large";
        p.innerText = "Age: " + m.age + "\n"
            + "Secret Identity: " + m.secretIdentity + "\n"
            + "Powers: " + m.powers;
        member.appendChild(p);
        main.appendChild(member);
    });
}