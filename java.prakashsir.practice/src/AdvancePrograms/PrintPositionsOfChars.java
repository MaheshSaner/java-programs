package AdvancePrograms;

import java.util.LinkedHashSet;

public class PrintPositionsOfChars {

	public static void main(String[] args) {



		String s="Tester";
		s=s.toLowerCase();
		
		System.out.println(s);

		LinkedHashSet<Character> set= new LinkedHashSet<Character>(); 

		 //for loop to add in set

		for(int i=0; i<s.length();i++) {
			set.add(s.charAt(i));
		}


		//for each loop to iterate set 
		for(char ch:set)
		{
			int count =0;	

			//for to compare each value from set with each value of string
			for(int i=0;i<s.length(); i++) {

				if(ch==s.charAt(i)) {
					System.out.println("position of "+ch+"="+(i+1));  
					break;
				}
			}
			//			
			//			   System.out.println(ch+":"+count);
			//			  if(count>1) {
			//				  System.out.println(" duplicate chars are:"+ch);
			//			  }	 

		}

	} 
}
