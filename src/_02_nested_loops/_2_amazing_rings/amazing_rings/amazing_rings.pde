void setup() {
 
  // set the size of your sketch
  size(500, 250);
}
int x = 125;
int x2 = 375;
int direction = 1; 
void draw() {
  background(#AAAAAA); 
  for (int i = 0; i < 100; i++) {
  noFill();
  ellipse(x,125,200-(4*i),200-(4*i));
  ellipse(x2, 125, 200-(4*i),200-(4*i));
  }  
x = x +(1*direction);
x2 = x2 - (1*direction);
if (x2==250&&x==250&&direction==1) {
direction = -1; 
}
if (x2==400&x==100&&direction==-1) {
 direction = 1; 
}
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
