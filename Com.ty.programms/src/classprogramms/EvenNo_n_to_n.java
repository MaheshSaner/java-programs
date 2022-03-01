package classprogramms;

import java.util.Scanner;

public class EvenNo_n_to_n {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("plz enter the first no:-");
		int num1 = sc.nextInt();
		
		System.out.println("plz enter the second no:-");
		int num2 = sc.nextInt();
		
		while(num1<=num2) {
			
			if(num1%2==0) {
				System.out.print(num1+" ");
			}
			num1++;
		}

	}

}
