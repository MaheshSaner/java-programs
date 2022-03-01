package arraysPrograms;

import java.util.Arrays;

public class ArrayBinSearch {

	public static void main(String[] args) {
		
		int a[]= {8,16,38,56,38,98,81,39,-1};
		
		int key=39;
		
		int result=Arrays.binarySearch(a, key);
		
		if(result>0) {
			System.out.println(key+" Index Is "+result);
		}
		
		else {
			System.out.println("element is not found");
		}
		
	}
}
