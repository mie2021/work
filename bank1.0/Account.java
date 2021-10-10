package bank;

import java.util.Date;

public class Account {
	
    private String id,name;//账户编号、账户名称
    private double balance;//账户余额
    private Date datetime;//开户时间
    private StringBuffer statement;//账户流水
    
    //账户编号 获取 赋值
    public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	//账户名称 获取 赋值
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	//账户余额 获取 赋值
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }
	//开户时间 获取 赋值
	public Date getDatetime() { return datetime; }
	public void setDatetime(Date datetime) { this.datetime = datetime; }
	
	//构造账户
	public Account() {
		this.id = null;
		this.name = null;
		this.balance = 0;
		this.datetime = new Date();
		this.statement = new StringBuffer();
	}
	public Account(String id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.datetime = new Date();
		this.statement = new StringBuffer("开户时存入:"+this.balance);
	}
	
	//存钱方法
	public void deposite(double money) {
		this.balance = this.balance + money;
		this.statement.append("\n"+"存入:"+money+" 余额:"+balance);
	}
	//取钱方法
	public void withdraw(double money) {
		if(this.balance<money) {
			System.out.println("您的余额不足，不能取钱");
			return;
		}
		this.balance = this.balance - money;
		this.statement.append("\n"+"取出:"+money+" 余额:"+balance);
	}
	//转账方法，当前账户对象转给other账户对象，money是要转的金额
	public void changeMoney(Account other, double money) {
		if(this.balance<money) {
			System.out.println("您的余额不足，不能转账");
			return;
		}
		this.balance = this.balance - money;
		this.statement.append("\n"+"转出给"+other.name+":"+money+" 余额:"+balance);
		other.balance = other.balance + money;
		other.statement.append("\n"+"从"+this.name+"转入:"+money+" 余额:"+balance);
	}
	
	public void showInformation() {
		System.out.println("账户编号:"+this.id+" 账户名称:"+this.name+" 开户时间:"+this.datetime);
		System.out.println("账户余额:"+this.balance);
		System.out.println("流水：\n"+this.statement+"\n ");
	}

	//print()方法完成显示账户基本信息的功能
	public void print() {
		System.out.println("账号："+id+"  用户名："+name+"  余额："+balance);
	}
	
}
