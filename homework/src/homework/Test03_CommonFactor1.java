package homework;

import java.util.Scanner;

public class Test03_CommonFactor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int temp,o;
		System.out.print("请输入第一个数:");
		int num1 = in.nextInt();
		System.out.print("请输入第二个数:");
		int num2 = in.nextInt();
		if (num1<num2)
		{
			temp=num2;
			num2=num1;
			num1=temp;
		}
		for (o=num2;;o--)
		{
			if (num1%o==0&&num2%o==0) break; 
		}
		System.out.println("最大公因数为:"+o);
//		System.out.println("最小公倍数为:"+num1*num2/o); 

	}

}
