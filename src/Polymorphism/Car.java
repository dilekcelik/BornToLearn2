package Polymorphism;
//  1.45- Polymorphism


public abstract class Car {
public Car() {
	// TODO Auto-generated constructor stub
	//System.out.print("Print");
}
	//setup some methods
	public double mpg(double miles, double gallons){
		return (miles/gallons);
	}
	
	
	//ABSTRACT METHOD (normal metotlar gibi icine bisey yazmiyoruz)
	public abstract void setupComputer();
	
	//ABSTRACT METHOD2
	public abstract void tireSize(int year , String model);
	
	//ABSTRACT METHOD3
	public void speak(){
		System.out.print("I am a car.");
	}
}
