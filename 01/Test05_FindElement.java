package homework;

import java.util.Scanner;

public class Test05_FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 10;                        //nΪ����ĳ���
		int sum = 0;                       //��������Ԫ�صĺ�
		int average;                       //��������Ԫ�ص�ƽ��ֵ
		int[] count = new int[n];          //��������count
		
		System.out.println("������"+n+"����:");
		for (int i=0; i<count.length; i++) {
			count[i] = sc.nextInt();
		}
		for (int i=0; i<count.length; i++) {
			sum = sum + count[i];
		}
		
		average = sum/n;                   //����ƽ��ֵ
		
		for (int i=0; i<count.length; i++) {
			if(count[i]>average) {
				System.out.print(count[i]+" ");
			}
			
		}
		
	}

}
