package sample;

public class Convertint {
	
	public static void converttoint(String str) {
		
		int a = Integer.parseInt(str);
		System.out.println(a);
	}
	
	public static void converttoint1(String str) {
		  
		int a = 0;
		for (int i = 0; i<str.length();i++) {
			a = a*10+(str.charAt(i)-'0');
			
		}
		System.out.println(a);
		
		
	}
	
	public static void main(String[] args) {
		converttoint("1234");
		converttoint1("5612");
	}
}
