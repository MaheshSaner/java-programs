package strings.practice;

import java.util.LinkedHashSet;

public class CheckForDuplicateChar {

	public static void main(String[] args) {


		String s="testyantra";
		
		  LinkedHashSet<Character> set= new LinkedHashSet<Character>();


		  for(int i=0; i<s.length();i++) {
			  set.add(s.charAt(i));
		  }
		  
		  
		  for(char ch:set) {
			  int count =0;			  
			  for(int i=0;i<s.length(); i++) {
				  
				  if(ch==s.charAt(i)) {
					  count++;       
					  }
			  }
			
			   System.out.println(ch+":"+count);
			  if(count>1) {
				  System.out.println(" duplicate chars are:"+ch);
			  }	 
	}}}
