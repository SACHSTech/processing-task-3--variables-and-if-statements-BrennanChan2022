import processing.core.PApplet;

  /**
  * A program Sketch.java that draws a house in random locations with random background colours.
  * @author: B. Chan
  */

public class Sketch extends PApplet {

  float randHouseX = random(0, 500);
  float randHouseY = random(0, 500);
  // rect(130,160,240,240)
  
  public void settings() {
    size(500, 500);
  }

  // Set background to blue
  public void setup() {
    background(176, 227, 255);
  }

  public void draw() {
	  
    // Draw grass + dirt
    noStroke();
    fill(57, 184, 65);
    rect(0,400,500,50);

    fill(107, 68, 27);
    rect(0,450,500,50);
 
    // Set stroke settings for house + roof
    stroke(0,0,0);
    strokeWeight(1);

    // Draw house + roof
    fill(148, 61, 61);
    rect(130,160,240,240);

    fill(130, 127, 127);
    rect(310,80,40,60);
    triangle(100, 160, 250, 80, 400, 160);

    // Draw door and windows
    fill(79, 5, 5);
    rect(220,300,60,100);

    fill(203, 212, 211);
    ellipse(180, 270, 50, 60);
    ellipse(320, 270, 50, 60);
    rect(220,180,60,50);

    // Draw window panes
    stroke(0,0,0);
    line(250, 180, 250, 230); 
    line(220, 205, 280, 205); 

    // Draw sun and clouds
    noStroke();
    fill(255, 251, 33);
    ellipse(40, 40, 60, 60);

    // Set variables to current time
    var currentHour = hour();
    var currentMinute = minute();
    var currentSecond = second();
    
    var currentTime = currentHour + ":" + nf(currentMinute, 2) + ":" + nf(currentSecond,2);
    
    fill(255);
    noStroke();
    textSize(18);
    
    text(currentTime, 420, 495);
  }

  
}