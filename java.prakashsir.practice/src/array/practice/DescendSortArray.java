package array.practice;

public class DescendSortArray {

	public static void main(String[] args) {

		int [] arr = {1,4,9,7,10,3,4};
		
		//iterate over the given the array
				for(int i=0; i<arr.length; i++) {
					
					for(int j=i+1; j<arr.length; j++) {
						
						if(arr[i]<arr[j]) {
							int temp=arr[i];
							arr[i]=arr[j];
							
							arr[j]=temp;
							
						}
					}
					
					System.out.println(arr[i]+" ");

					
				}

			
 
	}

}
