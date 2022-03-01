package NumberPrograms;

import java.util.Scanner;

public class PrimePalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the Number");
		int num= sc.nextInt();
		
		boolean pm=prime(num);
		boolean pl=palindrome(num);
		
		if(pm&&pl) {
			System.out.println("It's a Prime and Palindrome Number");
		}
		else {
			System.out.println("Not a Prime and Palindrome Number");
		}
		
	}
		
		public static boolean prime(int num) {
			
			int i=2;
			
			while(i<=num) {
				
				if(num%i==0) {
					break;
				}
				i++;
			}
			if(num==i) {
				return true;
			}
			
			else {
				return false;
			}}
		
		
		public static boolean palindrome(int num) {
			
			int temp=num;
			int reverse=0;
			while(num!=0) {
				int digit=num%10;
				reverse=reverse*10+digit;
				
				num=num/10;
			}
			
			if(reverse==temp) {
				return true;
			}
			
			else {
				return false;
			}
		
		}
;
		
	}


