package NumberPrograms;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Plz Enter the number");
//	    int num=sc.nextInt();
	    
		int num=11234;
	    int reverse=0;
	    
	    while(num>0) {
	    	int digit=num%10;  //4 3 2 1 1
	    	
	    	reverse= (reverse*10)+digit; //4 43 432 4321 43211
	    	
	    	num=num/10; //1123 112  11  1   0
	    	
	    	
	    }
		
	    System.out.print(reverse);
	}

}
