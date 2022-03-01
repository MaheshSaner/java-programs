package stringProgramms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String s1= "Life";
		String s2= "File";
		

		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char ch1[]=s1.toCharArray();
	    char ch2[]=s2.toCharArray();
	    
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    
	    String s3=String.valueOf(ch1);
	    String s4=String.valueOf(ch2);
	    
	    
	    if(s3.equals(s4)) {
	    	System.out.println("Given String are anagrams");
	    }
	    else {
	    	System.out.println("Not a anagram");
	    }

	}

}
