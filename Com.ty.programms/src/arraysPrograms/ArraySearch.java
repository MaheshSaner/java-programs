package arraysPrograms;

public class ArraySearch {

	public static void main(String[] args) {
		
		int a[]= {8,16,20,30,-1};
		
		int value=-1;
		
		int result=search(a,value);
		
		if(result>0) {
			System.out.println(value+"Index is "+result);
		}
		
		else {
			System.out.println("element not found");
		}

	}

	public static int search(int[] a, int value) {
		
		for (int i = 0; i < a.length; i++) {
			
			if(value==a[i]) {
				return i;
			}
		}
		return-1;
		
	}

}
