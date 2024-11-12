package sample;

import java.util.Arrays;

public class SecondMax {
	
	public static void getsecondmax(int []x) {
		
		Arrays.sort(x);;
		System.out.println(x[x.length-2]);
		
	}
	public static void getsecondmax1(int []x) {
		int max= 0;
		int secondmax=0;
		for (int a :x) {
			if(max < a) {
				secondmax = max;
				max =a;
			}
			
		}
		System.out.println(secondmax);
		
	}
	public static void main(String[] args) {
		int[]a = new int[] {3,5,7,8,45,67,54};
		getsecondmax(a);
		getsecondmax1(a);
	}

}
