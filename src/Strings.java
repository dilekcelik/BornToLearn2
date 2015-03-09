
public class Strings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hello Dilek`s World!");
	
	String s = "dilekcelikdilekcelik";
	System.out.println(s.indexOf('c'));
	System.out.println(s.indexOf('c' , 6));
	
	System.out.println(s.indexOf("cel"));
	
	
	String a= "Dilek";
	String b = "Celik";
	
	System.out.println(a.concat(b));
	
	System.out.println(a.replace('D', 'C'));
	
	//trim deletes spaces
	System.out.println(b.trim());
	
	}
}
