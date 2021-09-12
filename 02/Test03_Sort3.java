package homework1;

public class Test03_Sort3 {

	public static void sort(int arr[]) {
		// TODO Auto-generated method stub
	    int j;
	    for (int gap = arr.length / 2; gap > 0; gap /= 2) {
	    	for (int i = gap; i < arr.length; i++) {
	    		int tmp = arr[i];
	    		for (j = i -gap; j >= 0 && tmp < arr[j]; j-= gap) {
	    			arr[j +gap] = arr[j];
	    		}
	    		arr[j + gap] = tmp;
	    	}
	    }
	}
	public static void main(String[] args) {
		int[] b = new int[] {48,5,89,80,81,23,45,16,2};
		sort(b);
		for (int i=0; i<b.length; i++)
			System.out.print(b[i]+",");
	}

}
