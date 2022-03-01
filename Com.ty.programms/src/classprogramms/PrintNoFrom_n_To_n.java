package classprogramms;

import java.util.Scanner;

public class PrintNoFrom_n_To_n {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("plz enter the first no :-");
		int num1 = sc.nextInt();
		
		System.out.println("plz enter the second no :-");
		int num2 = sc.nextInt();
		
		while(num1<=num2) {
			System.out.print(num1);
			System.out.print(" ");
			num1++;
		}
			
	}
}
