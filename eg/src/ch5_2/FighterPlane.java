package ch5_2;

public class FighterPlane implements IPlane {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public FighterPlane(String name) {
		this.name = name;
	}
	//实现IPlane中定义的抽象方法
	public void fly(double speed) {
		System.out.println("My name is:" +name+ "; My speed is:" +speed);
	}
	
	public static void main(String[] args) {
		IPlane plane1  = new FighterPlane("歼20");
		plane1.fly(2000);
	}
}
