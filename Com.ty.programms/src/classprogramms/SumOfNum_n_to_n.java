package classprogramms;

import java.util.Scanner;

public class SumOfNum_n_to_n {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz enter the first number");
		int num1 = sc.nextInt();
		int temp =num1;
		
		System.out.println("plz enter the second number");
		int num2 = sc.nextInt();
		
		int sum =0;
		
		while(num1<=num2) {
		sum=sum+num1;
		num1++;
		}
		
		System.out.println("sum of "+temp+" & "+num2+" is="+sum);
		
	}
}
