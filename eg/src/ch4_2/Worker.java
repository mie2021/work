package ch4_2;

public class Worker {
	private String name;
	private double wage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public Worker(String name, double wage) {
		this.name = name;
		this.wage = wage;
	}
	//�ǹ��ʷ�����ÿ����100Ԫ
	public void increase() {
		this.wage = this.wage + 100;
	}
	public void print() {
		System.out.println("������"+name);
		System.out.println("н�ʣ�:"+wage);
	}
}
