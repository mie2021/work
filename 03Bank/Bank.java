package homework2;

public class Bank {
	public static void main(String[] args) {
		Account zhangSan = new Account("001","����",1000);
		Account liSi = new Account("002","����",1000);
		zhangSan.deposite(2000);
		liSi.withdraw(500);
		zhangSan.changeMoney(liSi,300);
		System.out.println("����������ǣ�"+zhangSan.getBalance());
		System.out.println("���ĵ�����ǣ�"+liSi.getBalance());
	}
}
