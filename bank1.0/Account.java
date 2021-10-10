package bank;

import java.util.Date;

public class Account {
	
    private String id,name;//�˻���š��˻�����
    private double balance;//�˻����
    private Date datetime;//����ʱ��
    private StringBuffer statement;//�˻���ˮ
    
    //�˻���� ��ȡ ��ֵ
    public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	//�˻����� ��ȡ ��ֵ
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	//�˻���� ��ȡ ��ֵ
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }
	//����ʱ�� ��ȡ ��ֵ
	public Date getDatetime() { return datetime; }
	public void setDatetime(Date datetime) { this.datetime = datetime; }
	
	//�����˻�
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
		this.statement = new StringBuffer("����ʱ����:"+this.balance);
	}
	
	//��Ǯ����
	public void deposite(double money) {
		this.balance = this.balance + money;
		this.statement.append("\n"+"����:"+money+" ���:"+balance);
	}
	//ȡǮ����
	public void withdraw(double money) {
		if(this.balance<money) {
			System.out.println("�������㣬����ȡǮ");
			return;
		}
		this.balance = this.balance - money;
		this.statement.append("\n"+"ȡ��:"+money+" ���:"+balance);
	}
	//ת�˷�������ǰ�˻�����ת��other�˻�����money��Ҫת�Ľ��
	public void changeMoney(Account other, double money) {
		if(this.balance<money) {
			System.out.println("�������㣬����ת��");
			return;
		}
		this.balance = this.balance - money;
		this.statement.append("\n"+"ת����"+other.name+":"+money+" ���:"+balance);
		other.balance = other.balance + money;
		other.statement.append("\n"+"��"+this.name+"ת��:"+money+" ���:"+balance);
	}
	
	public void showInformation() {
		System.out.println("�˻����:"+this.id+" �˻�����:"+this.name+" ����ʱ��:"+this.datetime);
		System.out.println("�˻����:"+this.balance);
		System.out.println("��ˮ��\n"+this.statement+"\n ");
	}

	//print()���������ʾ�˻�������Ϣ�Ĺ���
	public void print() {
		System.out.println("�˺ţ�"+id+"  �û�����"+name+"  ��"+balance);
	}
	
}
