package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
	
	public static void checkanagram(String str1, String str2) {
	
	str1 = str1.replaceAll("\\s", "").toLowerCase();
	str2 = str2.replaceAll("\\s", "").toLowerCase();
	
	if (str1.length()!= str2.length()) {
		System.out.println("Strings are not anagrams");
	}
	char []ch1 = str1.toCharArray();
	char []ch2 = str2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	if (Arrays.equals(ch1, ch2)) {
		System.out.println("Strings are anagrams");
	}
	}
	public static void checkanagram1(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		List<Character> lst1 = new ArrayList<Character>();
		List<Character> lst2 = new ArrayList<Character>();
		
		for(char c : str1.toCharArray()) {
			lst1.add(c);
		}
		for(char c : str2.toCharArray()) {
			lst2.add(c);
		}
		Collections.sort(lst1);
		Collections.sort(lst2);
		if(lst1.equals(lst2)) {
			System.out.println("Strings are anagram");
		}else {
			System.out.println("Strings are not");
		}
		
	}
	
	public static void main(String args[]) {
		checkanagram("Listen", "silen");
		checkanagram1("Listen", "silent");
	}

}
