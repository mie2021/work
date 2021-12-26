package ch5_2;

public class ChineseAirBoat implements IAirBoat {
	private String type;
	public void setType(String type) {
		 this.type = type;
	}
	public String getType() {
		return type;
	}
	public ChineseAirBoat(String type) {
		this.type = type;
	}
	public void fly(double speed) {
		System.out.println("我的型号是："+type+"; 我能以："+speed+"的速度航行");
	}
	public void sail(double speed) {
		System.out.println("我的型号是："+type+"; 我能以："+speed+"的速度飞行");
	}
	/*ship是Iship类型，只有sail方法，没有fly方法，
	 * 尽管ship用ChineseAirBoat类的构造方法来创建对象，
	 * 内存里有fly方法，但IShip类型不能调用fly方法
	 */
	public static void main(String[] args) {
		IAirBoat airboat = new ChineseAirBoat("蛟龙-600");//向上转型，用IAirBoat接口声明变量airboat
		airboat.fly(1000);
		airboat.sail(500);
		IShip ship2 = new ChineseAirBoat("蛟龙-500");//
		ship2.sail(400);
//		ship2.fly(800);//ship2不能调用fly方法
	}
}
