package ch5_1;

public class TextShape4 {
	//sumShape方法实现计算一组图形（数组shapes）的面积的和，图形包含Circle和Rectangle
	public double sumShape(Shape[] shapes) {
		double sum = 0;
		for(int i=0; i<shapes.length; i++) {
			sum = sum + shapes[i].getArea();
		}
		return sum;
	}
	public static void main(String[] args) {
		Shape[] s = new Shape[4];
		s[0] = new Circle(3);//向上转型
		s[1] = new Circle(4);
		s[2] = new Rectangle(4,3);
		s[3] = new Rectangle(5,3);
		TextShape4 ts = new TextShape4();//sumShapes是实例方法，需要创建对象
		System.out.println("sumShapes()="+ts.sumShape(s));
	}
}
