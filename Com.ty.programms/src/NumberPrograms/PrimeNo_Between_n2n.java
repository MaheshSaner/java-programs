package NumberPrograms;

import java.util.Scanner;

public class PrimeNo_Between_n2n {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second Number");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		}

		while(num1<=num2) {
			int i=2;
			
			while(i<=num1) {
				
				if(num1%i==0) {
					break;
				}
				i++;
			}
			
			if(i==num1) {
				System.out.print(num1+" ");
			}
			num1++;
		}
			
	}

}
 