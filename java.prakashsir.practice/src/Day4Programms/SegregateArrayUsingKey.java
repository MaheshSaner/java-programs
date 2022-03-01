package Day4Programms;

public class SegregateArrayUsingKey {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6};
		
		// key =3    o/p==>4,5,6,1,2,3
		//key =2     o/p==>3,4,5,6,1,2
		
		int key=2;
		
		for(int i=0; i<arr.length;i++) {
		
			if(arr[i]>key) {
				System.out.print(arr[i]+" ");
			}			
		}
		for(int i=0; i<key;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
