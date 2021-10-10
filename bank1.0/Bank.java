package bank;

public class Bank {

	public static void main(String[] args) {
		Account zhangSan = new Account("001","张三",1000);
		Account liSi = new Account("002","李四",1000);
		zhangSan.deposite(2000);
		liSi.withdraw(500);
		zhangSan.changeMoney(liSi,300);
		zhangSan.showInformation();
		liSi.showInformation();
	}

}
