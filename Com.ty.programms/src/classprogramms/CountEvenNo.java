package classprogramms;

import java.util.Scanner;

public class CountEvenNo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
	    System.out.println("plz enter the no.");
     	int num1 = sc.nextInt();
	
     	int i=0;
     	int count =0;
     	
     	while( i<= num1) {
     		if(i%2==0) {
     			System.out.print(i+" ");
     			count++;
     		}
     		i++;
     	}
     	System.out.println();
		System.out.println("The count is="+count);

	}

}
