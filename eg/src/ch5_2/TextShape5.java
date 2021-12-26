package ch5_2;

public class TextShape5 {
	public double sumShape(IShape[] shapes) {
		double sum = 0;
		for(int i=0; i<shapes.length; i++) {
			sum = sum + shapes[i].getArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		IShape[] s = new IShape[4];
		s[0] = new MyCircle(3);
		s[1] = new MyCircle(4);
		s[2] = new MyRectangle(4,3);
		s[3] = new MyRectangle(5,4);
		TextShape5 ts = new TextShape5();
		System.out.println("ts.sumShape()="+ts.sumShape(s));
	}
}
