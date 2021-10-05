package homework2;

import java.util.Date;

public class Account {
	private String id,name;//账户编号、账户名称
	private double balance;//账户余额
	private Date datetime;//开户时间
	public String getId() {return id; }
	public void setId(String id) { this.id = id;}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public double getBalance() {return balance; }
	public void setBalance(double balance) {this.balance = balance; }
	public Date getDatetime() { return datetime; }
	public void setDatetime(Date datetime) {this.datetime = datetime; }
	
	public Account(String id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.datetime = new Date();
	}
	
	public Account() {
		this.id = "";//id 默认为空,需在main方法中用setId赋值
		this.name = "";
		this.balance = 0;
		this.datetime = new Date();
	}
	//存钱方法
	public void deposite(double money) {
		this.balance = this.balance + money;
	}
	//取钱方法
	public void withdraw(double money) {
		if(this.balance<money) {
			System.out.println("您的余额不足，不能取钱");
			return;
		}
		this.balance = this.balance - money;
	}
	//转账方法，当前账户对象转给other账户对象，money是要转的金额
	public void changeMoney(Account other, double money) {
		if(this.balance<money) {
			System.out.println("您的余额不足，不能转账");
			return;
		}
		this.balance = this.balance - money;
		other.balance = other.balance + money;
	}
	//print(方法完成显示账户基本信息的功能
	public void print() {
		System.out.println("账号："+id+"  用户名："+name+"  余额："+balance);
	}
}
