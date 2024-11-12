package sample;

import java.util.Iterator;

public class FindDuplicate {
	
	public static void findduplicates(String str) {
		char[]ch = str.toLowerCase().toCharArray();
		
		for(int i = 0;i<str.length();i++) {
			int count= 0;
			
			for(int j =i+1;j<str.length();j++) {
				
				if (ch[i]==ch[j] && ch[i]!=' ') {
					count++;
					ch[j]=' ';
					
				}
			}
			if (ch[i] != ' ') {
			    System.out.println(ch[i] + "-- " + count);
			}
		}
	}
	
	public static void reversesentence(String sen) {
		
		
		String[]str = sen.split(" ");
		String rev ="";
		for(String word: str) {
			StringBuilder sb = new StringBuilder(word);
			rev = rev + sb.reverse()+" ";
			
		}
		System.out.println(rev);
		
	}
	public static void main(String[] args) {
		findduplicates("Sudarshan");
		reversesentence("Sudarshan Mali");
	}

}
