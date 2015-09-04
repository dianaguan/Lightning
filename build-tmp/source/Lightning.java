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

// Lights one = new Lights();
// void setup()
// {
//   size(800,500);
//   strokeWeight(1.5);
//   background(0,0,0);
// }

// void draw()
// {
// 	one.show();
// 	noLoop();
// }

// class Lights{
// 	int startX, startY, endX, endY;
// 	Lights(){	
// 		int startX = 400;
// 		int startY = 0;
// 		int endX = 400; 
// 		int endY = 0;
// 	}
// 	void show(){
// 		stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
// 		while(endY<500){
// 		    endY = startY + (int)(Math.random()*9);
// 		    endX = startX + (int)(Math.random()*18)-9;
// 		    line(startX,startY,endX,endY);
// 		    startY = endY;
// 		    startX = endX;
// 		}
// 	}
// 	void mousePressed()
// 	{
// 		startX = (int)(Math.random()*800);
// 	 	startY = 0;
// 	 	endX= 400;
// 	  	endY = 0;
// 	  	redraw();
// 	}
// }

int startX = 150;
int startY = 0;
int endX = 150; 
int endY = 0;

public void setup()
{
  size(800,500);
  strokeWeight(1.5f);
  // background(0,0,0);
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
	startX = (int)(Math.random()*800);
 	startY = 0;
 	endX= 150;
  	endY = 0;
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
