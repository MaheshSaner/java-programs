package NumberPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter the number");
		int num=sc.nextInt();
		
		//int product=fact(num);
		//System.out.println("Factorial of"+num+"is"+product);
		
		int i=1, product=1;
		
		while(i<=num) {
			product=product*i;
			i++;
		}
		
		System.out.println("factorial is "+num+" is "+product);
		
		
		//or
		
		int product1=1;
		for(int j=num;j>=1;j--) {
			
			product1=product1*j;
		}
		System.out.println("factorial is ="+product);

	}

	
	}


