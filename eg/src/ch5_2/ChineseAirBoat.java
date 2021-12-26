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
		System.out.println("�ҵ��ͺ��ǣ�"+type+"; �����ԣ�"+speed+"���ٶȺ���");
	}
	public void sail(double speed) {
		System.out.println("�ҵ��ͺ��ǣ�"+type+"; �����ԣ�"+speed+"���ٶȷ���");
	}
	/*ship��Iship���ͣ�ֻ��sail������û��fly������
	 * ����ship��ChineseAirBoat��Ĺ��췽������������
	 * �ڴ�����fly��������IShip���Ͳ��ܵ���fly����
	 */
	public static void main(String[] args) {
		IAirBoat airboat = new ChineseAirBoat("����-600");//����ת�ͣ���IAirBoat�ӿ���������airboat
		airboat.fly(1000);
		airboat.sail(500);
		IShip ship2 = new ChineseAirBoat("����-500");//
		ship2.sail(400);
//		ship2.fly(800);//ship2���ܵ���fly����
	}
}
