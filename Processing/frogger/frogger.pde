void setup()
{
  size(500, 500);
  ellipse(250, 250, 25, 25);
  rect(150,1,100,25);
  mouseY=500;
  mouseX=250;
}
void draw()
{ 

  background(0, 50, 255);
   fill(245,0,15);
   rect(170,1,100,25);
 fill(0,245,75);
  ellipse(X+=Xspeed, 250, 25, 25);

  if (X >= 500)
  {
    Xspeed=-Xspeed;
  }
  if (X <= 0)
  {
    Xspeed=-Xspeed;
  }

  ellipse(Y+=Yspeed, 300, 25, 25);

  if (Y >= 500)
  {
    Yspeed=-Yspeed;
  }
  if (Y <= 0)
  {
    Yspeed=-Yspeed;
  }
  ellipse(Z+=Zspeed, 200, 25, 25);

  if (Z >= 500)
  {
    Zspeed=-Zspeed;
  }
  if (Z <= 0)
  {
    Zspeed=-Zspeed;
  }
  ellipse(A+=Aspeed, 350, 25, 25);

  if (A >= 500)
  {
    Aspeed=-Aspeed;
  }
  if (A <= 0)
  {
    Aspeed=-Aspeed;
  }
  fill(255,255,255);
  ellipse(mouseX,mouseY,20,20);

}
int X = 250;
int Xspeed = 10;
int Y = 100;
int Yspeed = 15;
int Z = 450;
int Zspeed = 15;
int A = 225;
int Aspeed = 20;

