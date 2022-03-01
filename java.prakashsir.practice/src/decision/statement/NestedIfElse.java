package decision.statement;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter the number");
		int num = sc.nextInt();
		
		if(num%5==0 || num%3==0) {
			
			if (num%5==0) {
				System.out.println("hi");
				
				if(num%3==0) {
					System.out.println("bye");

								}
						}
			
		}
		
		else{
			System.out.println("Good bye");
		}
		
		
	}

}
