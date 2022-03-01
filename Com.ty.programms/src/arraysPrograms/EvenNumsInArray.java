package arraysPrograms;

import java.util.Scanner;

public class EvenNumsInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		
		int arr[]=new int[size];
		
		// add the numbers in array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the number for index "+i);
			 arr[i]=sc.nextInt();
			
		}
		
		//find the even nums in array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.print(arr[i]);
			}
		}
		

	}

}
