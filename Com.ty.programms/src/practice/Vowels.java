package practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Vowels {

	public static void main(String[] args) {
		
		String s1 = "india";
		
	/*	char ch[]=s1.toCharArray();
		
		int count =0;
		for (int i = 0; i < ch.length; i++) {
			
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
			
		}
		System.out.println("vowels are :"+count);
         */

	LinkedHashSet<Character> set= new LinkedHashSet<Character>();
	
	for (int i = 0; i < s1.length(); i++) {
		set.add(s1.charAt(i));
	}
	
	int count =0;
    
	for(char ch : set) {
	    	    	
	    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
		}
	    
	}
	System.out.println(s1+":"+count);
	}}

	                               


