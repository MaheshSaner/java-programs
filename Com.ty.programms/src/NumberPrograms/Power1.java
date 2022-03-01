package NumberPrograms;

import java.util.Scanner;

public class Power1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		
		System.out.println("enter the power");
		int pw=sc.nextInt();
		
		int result=pow(num,pw);
		System.out.println("The power of the given number is "+result);
	}
		
		public static int pow(int num, int p) {
			
			int result=1;
			
			for (int i = 0; i < p; i++) {
				result=result*num;
			}
			return result;
		
		

	}

}
