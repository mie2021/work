package ch5_1;

public class TextShape1 {
	public static void main(String[] args) {
		Circle c = new Circle(3);
		System.out.println("c.getArea()="+c.getArea());
		Rectangle r = new Rectangle(5,4);
		System.out.println("r.getArea()="+r.getArea());
	}
}
