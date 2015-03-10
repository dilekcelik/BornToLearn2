// 19 - Generic Return Types
import java.util.*;
public class GenericReturnTypes {
	public static void main(String[] args) {

	System.out.println(max(23,42,1));
	System.out.println(max("apples", "tots", "chickens")); //returns any type of data
	}
	
	//Generic Method: only objects from comparable class can be used in this method
	//a,b,c are variables of T generic method
	public static <T extends Comparable<T>> T max(T a, T b, T c){ 
		T max = a;

	//if it returns negative or positive number
	if(b.compareTo(a)>0)
	max =b;
	if(c.compareTo(max)>0)
	max = c;
	
	return max;
	}
	
}

