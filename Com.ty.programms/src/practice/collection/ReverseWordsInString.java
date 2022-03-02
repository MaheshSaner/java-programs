package practice.collection;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String s="Aapna Infotech Pvt. Ltd.";
		
		String[] sArr=s.split(" ");
		
		for (int i = sArr.length-1; i >=0; i--) {
			System.out.print(sArr[i]+" ");
		}
		

	}

}
