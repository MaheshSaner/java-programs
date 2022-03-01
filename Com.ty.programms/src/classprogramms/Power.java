package classprogramms;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the number :-");
		int num= sc.nextInt();
		
		System.out.println("plz Enter the power :-");
		int p = sc.nextInt();
		
		int result=1;
		
		for(int i=1; i<=p; i++) {
			result = result*num;
		}
		
		System.out.println("Power of the given number is ="+result);
		
		

	}

}
