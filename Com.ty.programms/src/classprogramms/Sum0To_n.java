package classprogramms;

import java.util.Scanner;

public class Sum0To_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter the number");
		
		int num=sc.nextInt();
		
		int i=0;
		int sum=0;
		
		while(i<=num) {
			sum= sum+i;
			i++;
		}

		System.out.println("sum of 0 to "+num+ " = " +sum);
		
	}

}
