package ch4_2;

public class Manager extends Worker {
	private double allowance;//津贴
//	private double wage;
	public double setAllowance() {
		return allowance;
	}
	public void getAllowance(double allowance) {
		this.allowance = allowance;
	}
//	public double setWage() {
//		return wage;
//	}
//	public void getWage(double wage) {
//		this.wage = wage;
//	}
	public Manager(String name,double wage,double allowance) {
		super(name,wage);
		this.allowance = allowance;
	}
	public void increase() {
//		this.wage = this.wage + 300;
		this.allowance = this.allowance + 200;
	}
	public void print() {
//		System.out.println(getName()+" wage:"+wage);
//		System.out.println(getName()+" super.wage:"+getWage()+" allowance:"+allowance);
		super.print();
		System.out.println("津贴："+allowance);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Worker w1 = new Worker("张三",2000);
		w1.increase();
		w1.print();
		Manager w2 = new Manager("李四",2000,500);
		w2.increase();
		w2.print();
		Worker w3 = new Manager("王五",2000,500);
		w3.increase();
		w3.print();
	}
}


