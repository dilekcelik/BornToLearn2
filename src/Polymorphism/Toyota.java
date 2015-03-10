package Polymorphism;
//  1.45- Polymorphism



public class Toyota extends Car{
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.print("I am a Toyota");
	}

	public Toyota() {
		// TODO Auto-generated constructor stub
	double mpg = mpg(60.03, 1.9);
	}

	@Override
	public void setupComputer() {
		// TODO Auto-generated method stub
		System.out.print("Computer Set Up!");
	}

	@Override
	public void tireSize(int year, String model) {
		// TODO Auto-generated method stub
		System.out.print("For the model"+ model + "you need a small tire.");
	}
	
}
