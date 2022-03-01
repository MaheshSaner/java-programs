package NumberPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		int temp=num;
		int reverse=0;
		while(num>0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);

		if(reverse==temp) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
