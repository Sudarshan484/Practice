package sample;

public class ReverseString {
	
	public static String reversestring(String str) {
		
		char[]ch = str.toCharArray();
		String rev = "";
		
		for(char c:ch) {
			rev = c+rev;
		}
		return rev;
	}
	
	public static void reversestring1(String str) {
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		System.out.println(sb.reverse());
	}
	
	public static void main(String args[]) {
		
		System.out.println(reversestring("Sudarshan"));
		reversestring1("Sudarshan");
	}

}
