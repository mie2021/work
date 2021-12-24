package ch5_1;

public class MonteCarlo_Exercise extends Shape {     //不会QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ 
	private double x,y;
	private int n;
	private int N = 1000000;//投N个点
	
//	private double getTotalArea() {
//		return x*y;
//	}
	
	public boolean judgment() {
		
		return true;
    }
	public double getArea() {
		for(int i=0; i<N; i++) {
			x = Math.random();
			y = Math.random();
			if(judgment()) {
				n++;
			}
		}
		return n/N;
	}
	public double getPerimeter() {
		return 0;
	}
}
