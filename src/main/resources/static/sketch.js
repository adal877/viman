function setup() {

    var clientHeight = document.getElementById('about').clientHeight;
    var clientWidth = document.getElementById('about').clientWidth;

    var cnv = createCanvas(clientWidth, clientHeight);
    cnv.parent("container-sketch");
    background(0);
}

function draw() {

    ellipse(width / 2 + random(10), height / 2 + random(10), 20, 20)
}