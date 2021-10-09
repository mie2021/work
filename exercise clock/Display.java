package clock;

public class Display {
	private int value;
	private int limit;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if(value == limit) {
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}	
//	public static void main(String[] args) {
//		Display test = new Display(24);
//		for(;;) {
//			test.increase();
//			System.out.println(test.getValue());
//		}
//	}
}
