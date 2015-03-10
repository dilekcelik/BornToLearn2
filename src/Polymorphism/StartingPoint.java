package Polymorphism;


public class StartingPoint {
	public static void main(String args[]){
	
		Toyota t = new Toyota();
		Car c1, c2, c3 ;
		c1 = new Toyota();
		c2 = new Honda();
		c3 = new Ford();
		
		c1.speak();
		System.out.println();
		c2.speak();
		System.out.println();
		c3.speak();
	
	}
	
}
