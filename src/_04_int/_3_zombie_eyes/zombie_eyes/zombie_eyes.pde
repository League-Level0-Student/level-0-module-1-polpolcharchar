PImage face;
void setup() {
 face = loadImage("zombie.jpeg");
size(400, 400);
face.resize(400, 400);
}
void draw() {
  image(face, 0, 0);
  if(mouseX > 200){
    fill(#FF0000);
  }
  else{
   fill(#0F38FC);
  }
  ellipse(125,185,90,110);
  if(mouseY > 200){
    fill(#0AF72F);
  }
  else{
   fill(#EFF70A);
  }
  ellipse(255,190,70,70);
  fill(#000000);
  ellipse(255,190,10,10);
  ellipse(125,185,10,10);
}
