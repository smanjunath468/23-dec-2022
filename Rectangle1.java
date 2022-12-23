package books;
import java.util.*;
public class Rectangle1 {

	 double length, breadth;
	  public Rectangle1(double length, double breadth)
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
	    System.out.println ("The Perimeter of Rectangle is" +
				(2 * (this.length + this.breadth)));
	  }

	}

	class Square extends Rectangle1
	{

	  public Square (double side)
	  {
	    super (side, side);
	  }
	  public class Rectangular
		{
	}

	
	  public static void main (String[]args)
	  {
	    Rectangle1 r = new Rectangle1 (4, 5);
	    Square s = new Square (5);
	      r.Area ();
	      r.Perimeter ();
	      s.Area ();
	      s.Perimeter ();

	  }
	}
	

