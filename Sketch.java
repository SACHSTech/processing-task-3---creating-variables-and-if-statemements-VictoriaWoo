import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
	// size call (ratio is 1.5:1)
    size(900, 600);
  }

  /** 
   * initial set up (background)
   */
  public void setup() {
    background(196, 212, 201);
  }
    float intRainbowWidth = random(150, 750);

   /**
   * Drawn to the screen
   */

  public void draw() {

    if (intRainbowWidth >= 550) {
      background(130, 220, 255);

      // Sun
      fill(255, 245, 130);
      ellipse(width, 0 , width/4, width/4);
      line(width * 5/6, height * 1/20, width * 23/30, height * 1/10);
      line(width * 7/8, height * 1/8, width * 49/60, height * 3/16);
      line(width * 11/12, height * 3/16, width * 7/8, height * 1/4);
      line(width * 29/30, height * 9/40, width * 19/20, height * 3/10);
      
      // Rainbow
      fill(239, 115, 113);
      ellipse(intRainbowWidth, height * 7/8, width * 2/3, height);
      fill(248, 181, 129);
      ellipse(intRainbowWidth, height * 15/16, width * 3/5, height);
      fill(253, 230, 151);
      ellipse(intRainbowWidth, height, width * 8/15, height);
      fill(151, 186, 129);
      ellipse(intRainbowWidth, height * 17/16, width * 7/15, height);
      fill(132, 146, 184);
      ellipse(intRainbowWidth, height * 9/8, width * 2/5, height);
      fill(168, 148, 186, 255);
      ellipse(intRainbowWidth, height * 19/16, width * 1/3, height);
      fill(130, 220, 255);
      ellipse(intRainbowWidth, height * 5/4, width * 4/15, height);

  	  // Grass
      fill(60, 171, 86);
      rect(0, height * 7/8, width, height * 1/8);

      // Birds
      noFill();
      arc(100, 80, 70, 40, PI, TWO_PI);
      arc(170, 80, 70, 40, PI, TWO_PI);
      arc(190, 140, 60, 35, PI, TWO_PI);
      arc(250, 140, 60, 35, PI, TWO_PI);
      arc(145, 190, 45, 20, PI, TWO_PI);
      arc(190, 190, 45, 20, PI, TWO_PI);
    }

    else if (intRainbowWidth >= 350) {
      background(208, 186, 213);

      fill(254, 98, 65);
      ellipse(width-100, 100 , width/5, width/5);

      // Rainbow
      fill(239, 115, 113);
      ellipse(intRainbowWidth, height * 7/8, width * 2/3, height);
      fill(248, 181, 129);
      ellipse(intRainbowWidth, height * 15/16, width * 3/5, height);
      fill(253, 230, 151);
      ellipse(intRainbowWidth, height, width * 8/15, height);
      fill(151, 186, 129);
      ellipse(intRainbowWidth, height * 17/16, width * 7/15, height);
      fill(132, 146, 184);
      ellipse(intRainbowWidth, height * 9/8, width * 2/5, height);
      fill(168, 148, 186, 255);
      ellipse(intRainbowWidth, height * 19/16, width * 1/3, height);
      fill(208, 186, 213);
      ellipse(intRainbowWidth, height * 5/4, width * 4/15, height);

    	// Grass
      fill(60, 171, 86);
      rect(0, height * 7/8, width, height * 1/8);
      
      // Birds
      noFill();
      arc(100, 80, 70, 40, PI, TWO_PI);
      arc(170, 80, 70, 40, PI, TWO_PI);
      arc(190, 140, 60, 35, PI, TWO_PI);
      arc(250, 140, 60, 35, PI, TWO_PI);
      arc(145, 190, 45, 20, PI, TWO_PI);
      arc(190, 190, 45, 20, PI, TWO_PI);
      
      // Stars
      fill(228, 223, 217);
      ellipse(50, 175, 5, 5);
      fill(228, 223, 217);
      ellipse(100, 50, 5, 5);
      fill(228, 223, 217);
      ellipse(180, 150, 5, 5);
      fill(228, 223, 217);
      ellipse(250, 90, 5, 5);
      fill(228, 223, 217);
      ellipse(375, 90, 5, 5);
      fill(228, 223, 217);
      ellipse(400, 190, 5, 5);
      fill(228, 223, 217);
      ellipse(500, 65, 5, 5);
      fill(228, 223, 217);
      ellipse(550, 150, 5, 5);
    }
    
    else {
      background(5, 49, 98);

      // Moon
      fill(228, 223, 217);
      ellipse(width-100, 100, width/5, width/5);
      
      // Rainbow
      fill(239, 115, 113);
      ellipse(intRainbowWidth, height * 7/8, width * 2/3, height);
      fill(248, 181, 129);
      ellipse(intRainbowWidth, height * 15/16, width * 3/5, height);
      fill(253, 230, 151);
      ellipse(intRainbowWidth, height, width * 8/15, height);
      fill(151, 186, 129);
      ellipse(intRainbowWidth, height * 17/16, width * 7/15, height);
      fill(132, 146, 184);
      ellipse(intRainbowWidth, height * 9/8, width * 2/5, height);
      fill(168, 148, 186, 255);
      ellipse(intRainbowWidth, height * 19/16, width * 1/3, height);
      fill(5, 49, 98);
      ellipse(intRainbowWidth, height * 5/4, width * 4/15, height);

  	  // Grass
      fill(60, 171, 86);
      rect(0, height * 7/8, width, height * 1/8);

      // Stars
      fill(228, 223, 217);
      ellipse(50, 175, 5, 5);
      fill(228, 223, 217);
      ellipse(100, 50, 5, 5);
      fill(228, 223, 217);
      ellipse(180, 150, 5, 5);
      fill(228, 223, 217);
      ellipse(250, 90, 5, 5);
      fill(228, 223, 217);
      ellipse(375, 90, 5, 5);
      fill(228, 223, 217);
      ellipse(400, 190, 5, 5);
      fill(228, 223, 217);
      ellipse(500, 65, 5, 5);
      fill(228, 223, 217);
      ellipse(550, 150, 5, 5);
    }

    // Time
    String StrTime = (hour() + ":" + minute());

    textSize(80);
    fill(6, 38, 0);
    text(StrTime, 20, 595);

  }
}