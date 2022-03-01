package arraysPrograms;

import java.util.Arrays;

public class InbuiltArrSort {

	public static void main(String[] args) {
		
		int a[]= {2,7,1,9,7,88,7,4,66};
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
