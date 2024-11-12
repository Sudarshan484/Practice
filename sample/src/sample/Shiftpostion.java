package sample;

import java.util.Arrays;

public class Shiftpostion {
	
	public static void shift(int []str, int n) {
		
		for (int i = 0;i<n;i++) {
			
			int lastind = str.length-1;
			int temp = str[lastind];
			int first = str[0];
			int last = str[lastind];
			
			str[0]= last;
			str[lastind]= first;
		}
		System.out.println(Arrays.toString(str));
		
	}
	
	public static void main(String[] args) {
		
		int []a = new int[] {1,2,4,5,7};
		shift(a, 3);
	}

}
