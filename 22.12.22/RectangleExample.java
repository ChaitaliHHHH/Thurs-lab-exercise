package Lab2212;


import java.util.*;
class Rectangle
{
  double length, breadth;
  public Rectangle (double length, double breadth)
  {
    this.length = length;
    this.breadth = breadth;

  }
  public void Area ()
  {
    System.out.println ("The Area of Rectangle is:" +
			this.length * this.breadth);
  }
  public void Perimeter ()
  {
    System.out.println ("The Perimeter of Rectangle is:" +
			(2 * (this.length + this.breadth)));
  }
  public void Area1 ()
  {
    System.out.println ("The Area of square is:" +
			this.length * this.breadth);
  }
  public void Perimeter1 ()
  {
    System.out.println ("The Perimeter of square is:" +
			(2 * (this.length + this.breadth)));
  }

}

class Square extends Rectangle
{

  public Square (double side)
  {
    super (side, side);

  }

}

public class RectangleExample
{
  public static void main (String[]args)
  {
    Rectangle r = new Rectangle (6, 8);
    Square s = new Square (4);
      r.Area ();
      r.Perimeter ();
      s.Area1 ();
      s.Perimeter1 ();

  }
}