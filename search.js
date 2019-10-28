const KEY = "de614a97"

fetch("http://www.omdbapi.com/?i=tt3896198&apikey=de614a97" + KEY + "&s=real")
    .then(res => res.json())
    .then(json => console.log(json));