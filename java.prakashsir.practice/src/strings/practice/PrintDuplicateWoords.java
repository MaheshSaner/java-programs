package strings.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintDuplicateWoords {

	public static void main(String[] args) {


		String s = "hello welcome hello world welcome to ty";
		String [] sArray= s.split(" ");
		
	LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(String word:sArray) {
			set.add(word);
		}
		
		
		
		for(String word2:set) {
			
			
			int count=0;
			
			for(int i=0; i<sArray.length;i++) {
				
				if(word2.equals(sArray[i])) {
					count++;
				}
			    }
			
			if(count>1) {
				System.out.println(word2+":"+count);
			}
			
			if(count==1) {
				System.out.println(word2+":"+count);
			}
		}
		
		
	}

}
