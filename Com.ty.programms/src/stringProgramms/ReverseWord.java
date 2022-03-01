package stringProgramms;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		
		String s1=sc.nextLine();
		
		*/
		 String s1="Mahesh is my name";
		
		 String str1[]= s1.split(" ");
		
		 System.out.println(str1.length);
		 String rev="";
		
	/*	for(String s:str1) {
			
			for (int i = 0; i < s.length(); i++) {
				rev=s.charAt(i)+rev;
			}
			rev= " "+rev;
			
		}
		System.out.println(rev);
		
		*/
		
		                 
	/*	for (int i = 0; i < str1.length; i++) {
			 
			String s=str1[i];  //mahesh
			
			for(int j=0;j<s.length();j++) {
				rev=s.charAt(j)+rev;
			}
			
			rev=" "+rev;
		}
		System.out.print(rev);
		
		*/
		 
		 String name="hi hello good morning";
		 String s ="";
		 
		char[] ch = name.toCharArray();
				
		for(int i=ch.length-1; i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		

	}

}
