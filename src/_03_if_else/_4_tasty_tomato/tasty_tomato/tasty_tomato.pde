void setup() {
    size(500, 500);
}
void draw() {
    background(255, 255, 255);
    noStroke();
    fill(#E55858);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#66EA83);
    rect(176, 103, 12, 32);
    if(mousePressed){
      fill(255, 255, 255);
      ellipse(74.5, 200, 25, 25);
    }
}
