package practice;

public class Demo1 {

	
	
	
	
	
	
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.speak();
		
		}
	}

 class Animal{
	
	void speak(){
		
		System.out.println("animal speaking");
		
	}
}
 class Dog extends Animal{
	 
	 
	 
	 void spea() { 
		 super.speak();
	 }
	 
 }
