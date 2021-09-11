package homework;

import java.util.Scanner;

public class Test05_FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 10;                        //n为数组的长度
		int sum = 0;                       //定义数组元素的和
		int average;                       //定义数组元素的平均值
		int[] count = new int[n];          //定义数组count
		
		System.out.println("请输入"+n+"个数:");
		for (int i=0; i<count.length; i++) {
			count[i] = sc.nextInt();
		}
		for (int i=0; i<count.length; i++) {
			sum = sum + count[i];
		}
		
		average = sum/n;                   //计算平均值
		
		for (int i=0; i<count.length; i++) {
			if(count[i]>average) {
				System.out.print(count[i]+" ");
			}
			
		}
		
	}

}
