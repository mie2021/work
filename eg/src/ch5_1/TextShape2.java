package ch5_1;

public class TextShape2 {
	public static void main(String[] args) {
		Shape shape1 = new Circle(3);//����ת�� ��ͬ��Shape shape1 = (Shape)new Circle(3);��������Ҫǿ������ת��
		Shape shape2 = new Rectangle(5,4);//����ת��
		Circle c1 = (Circle)shape1;//����ת��
		System.out.println("shape1.getArea()="+shape1.getArea());
		System.out.println("shape2.getPerimeter()"+shape2.getPerimeter());
		System.out.println("c1.getArea()"+c1.getArea());
	}

}
