package NumberPrograms;

public class PrimesInArray {

	public static void main(String[] args) {
		
		
		int [] arr= {2,7,5,73,17,23,78,64,52,29};
		
		
		System.out.println("Prime Nos in Array are :");
		for (int i = 0; i < arr.length; i++) {
			
		int num=arr[i];

		int j=2;
		
		while(j<=num) {
			if(num%j==0) {
				break;
			}
			j++;
		}
		
		if(j==num) {
			System.out.print(num+" ");
		}
		

	}

}
}
