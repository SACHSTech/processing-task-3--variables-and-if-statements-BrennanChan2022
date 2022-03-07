import processing.core.PApplet;

  /**
  * A program Sketch.java that draws a house in random locations with random background colours.
  * @author: B. Chan
  */

public class Sketch extends PApplet {

  public void settings() {
    size(400, 400);
  }

  // Set background to blue
  public void setup() {
    background(176, 227, 255);
  }

  public void draw() {
	  
    // Draw grass + dirt
    noStroke();
    fill(57, 184, 65);
    rect(0, height/1.25f, width/1f, height/10f);

    fill(107, 68, 27);
    rect(0, height/1.11f, width/1f, height/10f);
 
    // Set stroke settings for house + roof
    stroke(0, 0, 0);
    strokeWeight(1);
    
    // Draw house + roof
    fill(148, 61, 61);
    rect(width/3.85f, height/3.125f, width/2.083f, height/2.083f);

    fill(130, 127, 127);
    rect(width/1.61f, height/6.25f, width/12.5f, height/8.33f);    
    triangle(width/5f, height/3.125f, width/2f, height/6.25f, width/1.25f, height/3.125f);

    // Draw door and windows
    fill(79, 5, 5);
    rect(width/2.27f, height/1.67f, width/8.33f, height/5f);
    fill(110, 0, 0);
    ellipse(width/1.85f, height/1.43f, width/50f, height/50f);

    fill(203, 212, 211);
    ellipse(width/2.78f, height/1.85f, width/10f, height/8.33f);
    ellipse(width/1.563f, height/1.85f, width/10f, height/8.33f);
    rect(width/2.27f, height/2.78f, width/8.33f, height/10f);

    // Draw window panes
    stroke(0, 0, 0);
    line(width/2f, height/2.78f, width/2f, height/2.17f); 
    line(width/2.27f, height/2.44f, width/1.786f, width/2.44f); 

    // Draw sun and clouds
    noStroke();
    fill(255, 251, 33);
    ellipse(width/12.5f, height/12.5f, width/8.33f, height/8.33f);

    // Set variables to current time
    var currentHour = hour();
    var currentMinute = minute();
    var currentSecond = second();
    
    var currentTime = currentHour + ":" + nf(currentMinute, 2) + ":" + nf(currentSecond,2);
    
    fill(255);
    noStroke();
    textSize(12);
    
    text(currentTime, 345, 395);
  }

  
}