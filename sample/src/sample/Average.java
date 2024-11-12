package sample;

import java.util.HashMap;
import java.util.Map;

public class Average {
	
	
	public static Integer calculateAverage() {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Brain", 21);
		map.put("Lee", 22);
		map.put("Kumar", 45);
		
		
		System.out.println(map.values());
		int count = 0;
		int sum =0;
		for (int a : map.values()) {
			
			System.out.println(a);
			count++;
			sum = sum+a;
		}
		return sum/count;
		
	}
	
	public static void main(String args[]) {
		System.out.println(calculateAverage());
		
	}

}


// Brain – 21, Lee -22, Kumar – 45.