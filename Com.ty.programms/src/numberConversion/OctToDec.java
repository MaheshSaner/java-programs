package numberConversion;

import java.util.Scanner;

public class OctToDec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the Number:-");
		int num= sc.nextInt();
		
		int count=0,dec=0;
		
		while(num!=0) {
			
			int digit=num%10;
			dec=dec+digit*pow(8,count);
			count++;
			num=num/10;
			
		}

		System.out.println(dec);
	}
	
	public static int pow(int num,int pw) {
		 
		int prd=0;
		
		while(pw!=0) {
			prd=prd*num;
			pw--;
		}
		return prd;
		
	}

}
