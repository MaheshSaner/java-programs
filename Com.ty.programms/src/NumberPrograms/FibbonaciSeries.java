package NumberPrograms;

import java.util.Scanner;

public class FibbonaciSeries {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last Number");
		int num=sc.nextInt();
		
		int i=1,a=0,b=1,c=0;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		while(i<=num) {
			c=a+b;
			System.out.print(c+" ");
			
			a=b;
			b=c;
			
			i++;
		}
		

	}

}
