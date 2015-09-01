int startY = 0;
int startX = 150;
int endY = 0;
int endX = 150; 

void setup()
{
  size(800,500);
  strokeWeight(1.5);
  background(0,0,0);
}

void draw()
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

void mousePressed()
{
  startY = 0;
  startX = (int)(Math.random()*800);
  endY = 0;
  endX= 150;
}

