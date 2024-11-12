package sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GetMaxOcc {
	
	public static void getmaxocc(String str) {
		char[]ch = str.toLowerCase().toCharArray() ;
		Map<Character, Integer>map = new HashMap<Character, Integer>();
		
		for (int i =0;i<str.length();i++) {
			int count =1;
			for (int j =i+1;j<str.length();j++) {
				
				if (ch[i]==ch[j] && ch[i]!=' ') {
					count++;
					ch[j]=' ';
				}
			}
			if (count>0 && ch[i]!=' ') {
				System.out.println(ch[i]+" "+ (count));
				map.put(ch[i], count);
				
			}
			
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			if(entry.getValue()==Collections.max(map.values())) {
				System.out.println(entry.getKey()+" "+ entry.getValue());
			}
		}
		
		String str1 = "hello";
		String str2 = "world";
		str1.concat(str2);
		System.out.println(str1);
	}
	public static void main(String[] args) {
		getmaxocc("SudarshanSudarshan");
	}

}
