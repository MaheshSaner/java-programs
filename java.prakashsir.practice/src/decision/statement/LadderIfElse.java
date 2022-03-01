package decision.statement;

import java.util.Scanner;



public class LadderIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     
		System.out.println("plz enter the number");
		int num = sc.nextInt();
		
		if(num%5==0&& num%3==0) {
			System.out.println("hi-bye");
		}
		else if(num%5==0) {
			System.out.println("hi");
		}
		else if (num%3==0) {
			System.out.println("bye");
		}
		
		else {
			System.out.println("GoodBye");
		}
		
	}
	
	
	
}
