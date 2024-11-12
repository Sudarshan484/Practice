
public class Fibonaci {
	
	public static void fibonaci(int n) {
		
		int a= 0;
		int b = 1;
		System.out.print(a+",");
		System.out.print(b+",");
		for(int i = 2; i<=n;i++) {
			
			
			int c = a+b;
			System.out.print(c+",");
			a=b;
			b=c;
			
		}
	}
	
	
	public static void fibonaci1(int x) {
		int a = 0;
		int b = 1;
		System.out.println();
		System.out.print(a+","+b+",");
		
		for(int i =2; i<x;i++) {
			
			int c= a+b;
			System.out.print(c+",");
			a= b;
			b = c;
			
		}
		
	}
	public static void main(String[] args) {
		
		Fibonaci.fibonaci(10);
		fibonaci1(15);
		
	}

}

// 0,1,1,2,3,5,8,13
