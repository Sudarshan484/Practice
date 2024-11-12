
public class Swap {
	
	public static void swap1(int a, int b) {
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);
	}
	
	public static void swap2(int a, int b) {
		 int c;
		 c= a;
		 a = b;
		 b= c;
		 
		 System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		
		Swap.swap1(10, 20);
		Swap.swap2(30, 20);
	}

}
