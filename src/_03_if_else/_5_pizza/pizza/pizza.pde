PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
  
  pepperoni = loadImage("pepperoni.png");
  mushroom = loadImage("mushroom.png");
  olive = loadImage("olive.png");
    size(500,500);
    fill(#F2EBB3);
    ellipse(width/2, height/2, width, height);
    fill(#F05C72);
    ellipse(width/2, height/2, width-20, height-20);
    fill(#F4F50C);
    ellipse(width/2, height/2, width-50, height-50);
}
void draw() {
    if(mousePressed){
      image(pepperoni,200,200);
    }
    if(mousePressed && (mouseButton == RIGHT)) {
      image(mushroom,100,100);
      image(olive,300,300);
    }
     
}
