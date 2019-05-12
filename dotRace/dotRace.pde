//Make a variable to hold the X co-ordinate of the dot and set it to void setup() {
int x = 10;
void setup(){    
  size(800, 200);
}

void draw() {
    //make it a nice color
    //if the mouse is pressed...
  if (mousePressed){
    background(#0FACBF);
    fill(#BF0F0F);
    ellipse(x,100,10,10);
    x = x + 7;
    //... change the X co-ordinate so that the dot moves to the right
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.
    //Make your dot move really fast so that it can win the race 
        //(you have to figure out what part of your code to change)
    //Use this method to play a ding when your dot crosses the finish line.
    if (x> 800){
      playSound();
    }
  }
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }
}
