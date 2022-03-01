package arraysPrograms;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz Enter the Number");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("enter the value for index "+i);
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("sum of arr elements are "+sum);
	}

}
