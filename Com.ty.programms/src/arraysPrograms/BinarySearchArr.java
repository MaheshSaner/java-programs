package arraysPrograms;

import java.util.Arrays;

public class BinarySearchArr {

	public static void main(String[] args) {
		      
		       //li     mi    hi
		int a[]= {1,2,3,4,5,6,7,-1};
		
		int key=-1;
		
		Arrays.sort(a);
		
		int li=0;            //0
		int hi=a.length-1;   //6
		int mi=(li+hi)/2;    //3
		 
		while(li<=hi) {
			
			if(a[mi]==key){
				System.out.println(key+" index is "+mi);
				break;
			}
			
			else if(a[mi]<key) {    //right side
				li=mi+1;
			}
			
			else {                  //left side
				hi=mi-1;
			}
			
			mi=(hi+li)/2;
			
		}
		
		if(li>hi) {
			System.out.println("element not found");
		}
		

	}

}
