package NumberPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		
		int i=2;
		
		while(i<=num) {
			if(num%i==0) {
				break;
			}
			i++;
		}
		
		if(i==num) {
			System.out.println("It is Prime No.");
		}
		else
		{
			System.out.println("Not a Prime No");
		}

	}

}
