package homework;

import java.util.Scanner;

public class Test01_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("������������:");
        Scanner in = new Scanner(System.in);
        int age=in.nextInt();
        int leapyear = 0;
		for (int num = 0;num<=100;num++) //ѭ��100��
		{
			if(((age%4==0)&&(age%100!=0))||(age%400==0)) leapyear++;
			age++;
        }
		System.out.println(leapyear);
	}

}