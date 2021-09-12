package homework1;

public class Test01_Sort1 {

	public static void sort(int[] a) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i=0; i<a.length-1; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}
	public static void main(String args[]) {
		int[] b = new int[] {48,5,89,80,81,23,45,16,2};
		sort(b);
		for (int i=0; i<b.length; i++)
			System.out.print(b[i]+",");
	}

}
