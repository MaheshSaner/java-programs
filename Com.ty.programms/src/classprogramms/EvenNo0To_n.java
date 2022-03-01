package classprogramms;

import java.util.Scanner;

public class EvenNo0To_n {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
	    System.out.println("plz enter the no.");
     	int num1 = sc.nextInt();
	
     	int i=0;
     	
     	while( i<= num1) {
     		if(i%2==0) {
     			System.out.print(i+" ");
     		}
     		
     		i++;
     	}
	
	
	
	
	}

}
