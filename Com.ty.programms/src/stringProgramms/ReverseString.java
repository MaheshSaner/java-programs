package stringProgramms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String s1= sc.next();
		
		char ch[]=s1.toCharArray();
		
		String rev="";
	
		/*
		for(int i=ch.length-1; i>=0;i--) {
			rev=rev+ch[i];
		}
		
		*/
		
		for (int i = 0; i < ch.length; i++) {
			rev=ch[i]+rev;
		}
		
		System.out.println(rev);

	}

}
