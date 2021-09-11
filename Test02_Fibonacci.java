package homework;

import java.util.Scanner;

public class Test02_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ÊäÈënµÄÖµ:");
		int F0 = 0;
		int F1 = 1;
		int Fn = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0) {
        	System.out.println("Fn=0");
        }
        else if(n==1) {
        	System.out.println("Fn=1");
        }
        else if(n>=2) {
        	int i = 0;
        	while(i<n) {
        		Fn = F0 + F1;
        		F0 = F1;
        		F1 = Fn;
        		i++;
        	}
        	System.out.println("Fn="+Fn);
        }
        	
	}

}
