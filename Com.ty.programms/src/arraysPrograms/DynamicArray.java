package arraysPrograms;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		//receive and store values
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the value for index "+i );
			
			arr[i]=sc.nextInt();
		}
		
		//print the value
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
