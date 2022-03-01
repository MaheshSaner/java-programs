package numberConversion;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz Enter the Binary Number :-");
		int num=sc.nextInt();
		int dec=0, count=0;
		while(num!=0) {
			int digit = num%10;
			
			dec=dec+digit*pow(2,count);
			count++;
			num=num/10;
		}
		System.out.println(dec);

	}    
	      
	
	  public static int pow(int num,int pw) {
		  int res=1;
		  
		  while(pw!=0) {
			  res=res*num;
			  pw--;
		  }
		return res;
	  }
	
}
