package arraysPrograms;

public class ZigZag1 {

	public static void main(String[] args) {
		
		 int a[]= {1,2,3,4,5};
		 
		 int b[]= {6,7,8,9,10,11,12,13,14};
		 
		 int[] zigzag=new int[a.length+b.length];
		 
		 int length=(a.length>b.length)?b.length:a.length;
		
		 int k=0;
		 
		 for (int i = 0; i < length; i++) {
			zigzag[k++]=a[i];
			
			zigzag[k++]=b[i];
					
		}
		
		 if(a.length>b.length) {
			 
			 for (int i =length; i < a.length; i++) {
				zigzag[k++]=a[i];
			}
		 }
		 else { 
			 
			 for (int i =length; i < b.length; i++) {
				zigzag[k++]=b[i];
			}
		 }
		 
		 for (int i = 0; i < zigzag.length; i++) {
			System.out.print(zigzag[i]+" ");
		}

}}
