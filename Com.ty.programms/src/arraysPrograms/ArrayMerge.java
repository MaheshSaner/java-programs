package arraysPrograms;

public class ArrayMerge {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		int[] merge=new int[a.length+b.length];
		
		//........copy a[] into merge[]
		
		int count =0;
		for (int i = 0; i < a.length; i++) {
			merge[i]=a[i];
			count++;
		}

		//....... copy b[] into merge[]
		
		for (int i = 0; i < b.length; i++) {
			merge[count]=b[i];
			count++;
		}
		
		for (int i = 0; i < merge.length; i++) {
			System.out.print(merge[i]+" ");
		}
	}

}
