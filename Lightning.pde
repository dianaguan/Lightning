int startX = 400;
int startY = 0;
int endX = 400;
int endY= 0; 

void setup()
{
  size(800,500);
  strokeWeight(50);
  background(250,120,33);

}
void draw()
{
	lightning();
}
void lightning(){
	stroke((int)(Math.random()*30),(int)(Math.random()*30),(int)(Math.random()*30));
// 	while(endX < 600){

// }
	endX = startX + (int)(Math.random()*9);
	endY = startY + (int)(Math.random()*18)+9;
	line(startY,startX,endY,endX);
	}
void mousePressed()
{
	int startX = 400;
	int startY = 0;
	int endX = 400;
	int endY= 0;
}

