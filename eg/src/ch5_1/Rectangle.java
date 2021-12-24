package ch5_1;

public class Rectangle extends Shape {
	private double x,y;//³¤¡¢¿í
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Rectangle(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double getArea() {
		return x*y;
	}
	public double getPerimeter() {
		return 2*(x+y);
	}
}
