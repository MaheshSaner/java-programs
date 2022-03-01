package classprogramms;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz enter the no.");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Given no is even");
		}
		else {
			System.out.println("Given no. is odd");
		}

	}

}
