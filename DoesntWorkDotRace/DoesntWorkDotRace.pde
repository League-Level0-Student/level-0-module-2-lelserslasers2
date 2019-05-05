//Make a variable to hold the X co-ordinate of the dot and set it to 
int x = 0;
void setup() {
    size(800, 200);
}

void draw() {
    //make it a nice color
    fill (#B41010);
    //if the mouse is pressed...
    if (mousePressed){
    //... change the X co-ordinate so that the dot moves to the right
    x = x+ 15;
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.
    ellipse(x, 100, 20, 20);
    }
    //Make your dot move really fast so that it can win the race 
     //   (you have to figure out what part of your code to change)
     background(#0D0707);
    //Use this method to play a ding when your dot crosses the finish line. 
    if (x > 800) {
      playSound();
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