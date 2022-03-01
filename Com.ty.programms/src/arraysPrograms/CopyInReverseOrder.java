package arraysPrograms;

import java.util.Iterator;

public class CopyInReverseOrder {

	public static void main(String[] args) {
		
		int a[]= {32,56,85,90,91,52,70};
		
		int b[]= new int[10];
		
		
		for (int i = a.length-1; i >=0 ; i--) {
			b[(a.length-1)-i]=a[i];
			
		}
		


		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
	}

}
