import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startY = 0;
int startX = 150;
int endY = 0;
int endX = 150; 

public void setup()
{
  size(800,500);
  strokeWeight(1.5f);
  background(0,0,0);
}

public void draw()
{
 //lightning();
  stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		while(endY<500){
	   		 endY = startY + (int)(Math.random()*9);
	    		endX = startX + (int)(Math.random()*18)-9;
	    		line(startX,startY,endX,endY);
	    		startY = endY;
	    		startX = endX;
		}
}

public void mousePressed()
{
  startY = 0;
  startX = (int)(Math.random()*800);
  endY = 0;
  endX= 150;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
