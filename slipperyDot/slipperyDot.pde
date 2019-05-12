// create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    int x = 20;
    int y = 20;
    
    void setup() {
      //set the size of your sketch
      size(800,800);
      background(#64343A);
    }
    
    void draw() {
      //set the background color of your sketch
      background(#64343A);
      //draw an ellipse. Make sure it fits in the window.
      ellipse(x,y, 20,20);
      //use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      int distance;
      //6b. use the getDistance method to initialize your varible
      distance = getDistance(mouseX,mouseY, x,y);
      //    use the mouse's x and y and the x and y of your ellipse 
     
      //print the distance variable
      print(distance + ", ");
      if (mouseX< x+20 && mouseX > x-20 && mouseY < y+20 && mouseY> y-20){
        
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      
        //8b.  set the x and y of the ellipse to a random location on the window
       x = (int)random(801);
       y = (int)random(801);
      }
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
