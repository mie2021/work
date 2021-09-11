package homework;

import java.util.Random;

public class Test06_ArrayFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] posi_int = new int[20];
		Random r = new Random();
		for (int i=0; i<posi_int.length; i++) {
			int p = r.nextInt(459-77+1)+77;
			posi_int[i] = p;
		}
		System.out.println("20个随机数分别为:");
		for (int i=0; i<posi_int.length; i++) {
			System.out.print(posi_int[i]+" ");
		}
		int max = 0;
		int min = 500;
		int sum = 0;
		int average = 0;
		for (int i=0; i<posi_int.length; i++) {
			//求最大值
			if (posi_int[i]>max) {
				max = posi_int[i];
			}
		    //求最小值
			if (posi_int[i]<min) {
				min = posi_int[i];
			}
			sum = sum+posi_int[i];
			average = sum/20;
		}
		System.out.println("\n最大值为:"+max);
		System.out.println("最小值为:"+min);
		System.out.println("平均值为:"+average);
		System.out.println("和为:"+sum);

	}

}
