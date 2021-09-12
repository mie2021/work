package homework1;

public class Test02_Sort2 {

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			int x = arr[i];
			int j = i - 1;
			for (;j >= 0 && arr[j] > x;) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = x;
		}
	}
	public static void main(String[] args) {
		int[] b = new int[] {48,5,89,80,81,23,45,16,2};
		sort(b);
		for (int i=0; i<b.length; i++)
			System.out.print(b[i]+",");
	}
}
