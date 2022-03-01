package arraysPrograms;

public class EvenOdd {

	public static void main(String[] args) {
		
		int a[]= {1,2,33,44,996,223,15,22,45,64};
		
		int ev=0, od=0;
		
		//------to count even & odd
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0) {
				ev++;
			}
			else {
				od++;
			}
		}
		System.out.println(ev);
		System.out.println(od);
		
		int eve[]=new int[ev];
		int odd[]=new int[od];
		
		// to store the even values in eve & Odd values in odd
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0) {
				ev--;
				eve[ev]=a[i];
				
			}
			
			else {
				od--;
				odd[od]=a[i];
			}
		}
		
		//print the values 
		System.out.println("Even Numbers :");
		for (int i = 0; i < eve.length; i++) {
			System.out.print(eve[i]+" ");
		}
		System.out.println();
		
		System.out.println("Odd Numbers :");
		for (int i = 0; i < odd.length; i++) {
			System.out.print(odd[i]+" ");
			
		}
		
		

	}

}
