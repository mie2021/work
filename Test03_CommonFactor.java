package homework;

import java.util.Scanner;

public class Test03_CommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		int b,s,c;
		System.out.print("�������һ����:");
		int m = in.nextInt();
		System.out.print("������ڶ�����:");
		int n = in.nextInt();
		if(m>=n) {
			b=m;
			s=n;
		}
		else {
			b=n;
			s=m;
		}
		while(b!=s)
		{
			c=b-s;
			if(c>=s) {
				b=c;
			}
			else {
				b=s;
				s=c;
			}
		}
		System.out.println(m+"��"+n+"���������Ϊ:"+b);
	}

}
