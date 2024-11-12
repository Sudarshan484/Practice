import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
	
	public static void reverseString1(String str) {
		
		char[]a =  str.toCharArray();
		List<Character> list = new ArrayList<Character>();
		
		for(char c : a) {
			list.add(c);
		}
		System.out.println(list);
		Collections.reverse(list);
		for(char c : list) {
			System.out.print(c);
		}
	}
	
	public static StringBuffer reverseString2(int a) {
		
		String str = String.valueOf(a);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return sb;
	}
	
	public static void reverseString3(String str) {
		
		char[] ch = str.toCharArray();
		String rev = "";
		for(int i=0;i<ch.length;i++) {
			
			rev = ch[i]+rev;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		reverseString1("123456");
		reverseString2(123456);
		reverseString3("Sudarshan");
	}

}
