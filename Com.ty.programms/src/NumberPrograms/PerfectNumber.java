package NumberPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		//28
		// 1+2+4+7+14=28      addition of factors
		
		Scanner sc= new Scanner (System.in);
		System.out.println("plz enter the number");
		int num=sc.nextInt();
		
		
		int sum=0;
		
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
		if(sum==num) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println(" Not a perfect number");
		}

	}

}
