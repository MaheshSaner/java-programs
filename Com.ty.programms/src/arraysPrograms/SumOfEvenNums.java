package arraysPrograms;

import java.util.Scanner;

public class SumOfEvenNums {

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
		
		System.out.println("even numbers are :");
		//find the even nums in array
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.print(arr[i]);
				sum=sum+arr[i];
			}
		}
		System.out.println();
		System.out.println("sum of even nums ="+sum);

	}

}
