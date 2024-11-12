import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
	
	public static void duplicate(String str) {
		
		char[] a= str.toLowerCase().toCharArray();
		
		for (int i = 0; i<a.length;i++) {
			int count = 0;
			for (int j= i+1;j<a.length;j++ ) {
				
				if (a[i]==a[j] && a[i]!=' ') {
					count++;
					a[j]=' ';
				}
			}
			if (count>=1) {
			System.out.println(a[i]+" :"+(count+1));
			
			}
					
		}
	}
		
	public static void duplicate2(String str) {
		
		char []a = str.toLowerCase().stripIndent().toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (char c: a) {
			list.add(c);
		}
		Set<Character> set = new HashSet<Character>(list);
		
		System.out.println(set);
		for (char c: set) {
			int count=0;
			for (char ch : list) {
				if (c ==ch && c!=' ') {
					count++;
				}
			}
			System.out.println(c+" --"+count);
		}
		
	}
	
	public static void findDuplicateCharacters(String str) {
	    
	    char[] ch = str.toLowerCase().toCharArray();
	    for(int i=0;i<str.length();i++) {
	    	int count=0;
	    	for(int j=i+1;j<str.length();j++) {
	    		if(ch[i]==ch[j]&&ch[i]!=' ') {
	    			count++;
	    			ch[j]=' ';
	    		}
	    	}
	    	if(count>=0 && ch[i]!=' ') {
	    	System.out.println(ch[i]+" --"+(count+1));
	    	}
	    	}
	}
	
	public static void main(String[] args) {
		//FindDuplicate.duplicate("Sudarshan Sudarshan");
		//FindDuplicate.duplicate2("Mali Mali");
		FindDuplicate.findDuplicateCharacters("Simplilearn");
	}

}
