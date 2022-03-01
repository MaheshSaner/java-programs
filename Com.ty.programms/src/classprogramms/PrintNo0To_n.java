package classprogramms;

import java.util.Scanner;

public class PrintNo0To_n {

	public static void main(String[] args) {
		
		System.out.println("Please Enter the No. :-");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i=0;
		while(i<=num) {
			System.out.print(i);
			System.out.print(" ");
			i++;
		}
		
		
		
	}
}
