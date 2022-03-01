package arraysPrograms;

public class CopyFromOneToOther {

	public static void main(String[] args) {
		
		int a[]= {12,35,74,98,45,32,21,34};
		
		int b[]=new int[a.length];
		
		
		// copy a to b
		
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		
		//print b[] array
		
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
