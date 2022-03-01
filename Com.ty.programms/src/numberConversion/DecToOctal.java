package numberConversion;

import java.util.Scanner;

public class DecToOctal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the decimal value :-");
		int num=sc.nextInt();
		
		String oct="";
		
		while(num!=0) {
			int rem=num%8;
			oct=rem+oct;
			
			num=num/8;
			
		}

		System.out.println(oct);
	}

}
