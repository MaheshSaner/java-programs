package arraysPrograms;

public class ZigZag {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		int [] zigzag= new int [a.length+b.length];
		
		int k=0;
	
		/*
	 for (int i = 0; i < a.length; i++) {
			
			zigzag[k]=a[i];
			k++;
			
			zigzag[k]=b[i];
			k++;
		}              */
		
				
		for (int i = 0; i <a.length; i++) {
			zigzag[k++]=a[i];
			
			zigzag[k++]=b[i];
			
		}                  
		
		for (int i = 0; i < zigzag.length; i++) {
			System.out.print(zigzag[i]+" ");
		}
		
	}

}
