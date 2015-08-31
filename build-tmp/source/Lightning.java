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

int startX = 400;
int startY = 0;
int endX = 400;
int endY= 0; 

public void setup()
{
  size(800,500);
  strokeWeight(50);
  background(250,120,33);

}
public void draw()
{
	lightning();
}
public void lightning(){
	stroke((int)(Math.random()*30),(int)(Math.random()*30),(int)(Math.random()*30));
// 	while(endX < 600){

// }
	endX = startX + (int)(Math.random()*9);
	endY = startY + (int)(Math.random()*18)+9;
	line(startY,startX,endY,endX);
	}
public void mousePressed()
{
	int startX = 400;
	int startY = 0;
	int endX = 400;
	int endY= 0;
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
