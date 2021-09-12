package homework1;

public class Cube 
{
	private double side;
	public Cube(double radius)
	{ this.side = radius;
	}
	public double getRadius()
	{ return this.side;
	}
	public void setRadius(double side)
	{ this.side = side;
	}
	public double getArea()
	{ return side*side;
	}
	public double getPerimeter()
	{ return 4*side;
	}
}
