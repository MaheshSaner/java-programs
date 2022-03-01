package NumberPrograms;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Plz enter the number");
	
	int num=sc.nextInt();
	
	//19
	//10int num=568;
		int n=num;
	
	while(n>9) {
		int sum=0;
		
		   while(n>0) {
			   int id=n%10;
			   sum=sum+id;
			   n=n/10;
		   }
		   
		  n=sum;
	}
	
	System.out.println(n);
}
}