package Day4Programms;

public class AddNumsOfSameIndexOfTwoArr {

	public static void main(String[] args) {
		
	
	int[] a = {1,2,3,4,7,9,6};
	int [] b ={4,5,6};
	
	int result[]= new int[a.length];
	
	
	try {
	for(int i=0; i<a.length;i++) {
		
		result[i]=a[i]+b[i];
	}
	}
	
	
    catch (Exception e) 
	{
		for(int i=b.length; i<result.length;i++) {
			result[i]=a[i];
	}
		
    }
	
	
	//this for loop to print the o/p
	for(int i=0; i<result.length;i++) {
		System.out.print(result[i]+" ");
	}
}
}
