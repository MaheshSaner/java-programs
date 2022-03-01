package numberConversion;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz Enter The Decimal Value :-");
		int num=sc.nextInt();
		
		String bin="";
		
		while(num!=0) {
			int rem=num%2;
			
			bin=rem+bin;
			
			num=num/2;
		}
		
		System.out.println("Binary form of Given No is ="+bin);
		
	}

}
