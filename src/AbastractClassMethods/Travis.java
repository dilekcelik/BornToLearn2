package AbastractClassMethods;
// 1.28 - Using "this" in Java

public class Travis{
	
	int age;
	public Travis(int age) {
		//calling contructor of this class
		this(age, "Travis");
	}
	
	
	public Travis(int age, String name) {
	this.age= age;
	System.out.print(name + "" + this.age);
	}

}
