
void setup() {
  size(600,600);
}

void draw() {
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
    int y=125;
    int x=250;
  for (int i = 0; i<24; i++){

  if(i%2==0){
    noFill();
  ellipse(y, 300, x, x);}
  
  else{
    noFill();
    ellipse(y, 300, x, x);}
    x=x-10;
    
  }
  y=y+10;
  
  int z=625;
for (int i = 0; i<24; i++){

  if(i%2==0){
    noFill();
  ellipse(z, 300, x, x);}
  
  else{
    noFill();
    ellipse(z, 300, x, x);}
    x=x-10;
    
  }
  z=z+10;
}
