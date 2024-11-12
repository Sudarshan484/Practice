package sample;

import java.util.Arrays;

public class SortArray {
	
	public static void sortarray(int []x) {
		for(int j =0;j<x.length;j++) {
		for(int i =1;i<x.length;i++) {
			if (x[i-1]<x[i]) {
				int temp = x[i-1];
				x[i-1]=x[i];
				x[i]=temp;
			}
		}
		
	}
		System.out.println(Arrays.toString(x));
	}
	public static void main(String[] args) {
		int[] a= new int[] {3,2,6,9,78,45};
		sortarray(a);
	}

}
