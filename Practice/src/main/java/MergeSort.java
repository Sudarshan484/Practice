import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeSort {
	
	
	public static int[] mergearray(int [] a, int []b) {
		
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i : a) {
			
			set.add(i);
		}
		for(int j:b) {
			
			set.add(j);
		}
		
		int [] mergarray = new int[set.size()];
		int index = 0;
		for(int num: set) {
			mergarray [index++]= num;
		}
		
		return mergarray;
		
	}
	
	public static void main(String []args) {
		
		int[] arr1 = {4,6,7,8,4};
		int[]arr2 = {0,3,6,1,6};
		int[] marray =mergearray(arr1, arr2);
		System.out.println(Arrays.toString(marray));
	}

}
