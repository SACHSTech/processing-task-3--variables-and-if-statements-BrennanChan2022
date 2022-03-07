import processing.core.PApplet;

  /**
  * A program Sketch.java that draws a house in random locations with random background colours depending on the location.
  * @author: B. Chan
  */

public class Sketch extends PApplet {

  float randHouseX = random(100, 400);
  float randHouseY = random(100, 400);
  // rect(130,160,240,240)
  
  public void settings() {
    size(500, 500);
  }

  // Set background to depending on location
  public void setup() {
    background(176, 227, 255);
  }

  public void draw() {
	  
    // Draw grass + dirt
    noStroke();
    fill(57, 184, 65);
    rect(randHouseX - 130, randHouseY + 240, 500, 50);

    fill(107, 68, 27);
    rect(randHouseX - 130, randHouseY + 290, 500, 50);
 
    // Set stroke settings for house + roof
    stroke(0,0,0);
    strokeWeight(1);

    // Draw house + roof
    fill(148, 61, 61);
    rect(randHouseX, randHouseY, 240, 240);

    fill(130, 127, 127);
    rect(randHouseX + 180, randHouseY - 80, 40, 60);
    triangle(randHouseX - 30, randHouseY, randHouseX + 120, randHouseY - 80, randHouseX + 270, randHouseY);

    // Draw door and windows
    fill(79, 5, 5);
    rect(randHouseX + 90, randHouseY + 140, 60, 100);

    fill(203, 212, 211);
    ellipse(randHouseX + 60, randHouseY + 110, 50, 60);
    ellipse(randHouseX + 190, randHouseY + 110, 50, 60);
    rect(randHouseX + 90,randHouseY + 20, 60, 50);

    // Draw window panes
    stroke(0,0,0);
    line(randHouseX + 120, randHouseY + 20, randHouseX + 120, randHouseY + 70); 
    line(randHouseX + 90, randHouseY + 45, randHouseX + 150, randHouseY + 45); 

    // Draw sun
    noStroke();
    fill(255, 251, 33);
    ellipse(randHouseX - 90, randHouseY - 120, 60, 60);

    // Set variables to current time
    var currentHour = hour();
    var currentMinute = minute();
    var currentSecond = second();
    
    var currentTime = nf((currentHour - 5), 2) + ":" + nf(currentMinute, 2) + ":" + nf(currentSecond,2);
    
    fill(255);
    noStroke();
    textSize(18);
    
    text(currentTime, 420, 495);
  }

  
}