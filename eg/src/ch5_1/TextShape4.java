package ch5_1;

public class TextShape4 {
	//sumShape����ʵ�ּ���һ��ͼ�Σ�����shapes��������ĺͣ�ͼ�ΰ���Circle��Rectangle
	public double sumShape(Shape[] shapes) {
		double sum = 0;
		for(int i=0; i<shapes.length; i++) {
			sum = sum + shapes[i].getArea();
		}
		return sum;
	}
	public static void main(String[] args) {
		Shape[] s = new Shape[4];
		s[0] = new Circle(3);//����ת��
		s[1] = new Circle(4);
		s[2] = new Rectangle(4,3);
		s[3] = new Rectangle(5,3);
		TextShape4 ts = new TextShape4();//sumShapes��ʵ����������Ҫ��������
		System.out.println("sumShapes()="+ts.sumShape(s));
	}
}
