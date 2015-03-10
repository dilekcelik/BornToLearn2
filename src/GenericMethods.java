// 17 - Generic Methods (Generic classses and methods)
//Generic method; overloaded methods

import java.util.*;

public class GenericMethods {
	public static void main(String[] args) {

		Integer[] iray = {1,2,3,4};
		Character[] cray = {'b','u','c','y'};

		printMe(iray);
		printMe(cray);
		}
	
	//PrintMe
	//private static void printMe(Integer[] i) {
	//	for(Integer x: i)
	//		System.out.printf("%s ", x);
	//		System.out.println(); }

	//private static void printMe(Character[] i) {
	//	for(Character x: i)
	//		System.out.printf("%s ", x);
	//		System.out.println();
	
	//GENERIC METHOD (Tek method ile ikisini de yazdirdik, 17. ders ile karsilastir)
	 //one method ile hepsini print ettirdik
	public static<T> void printMe(T[] x){
	for(T b: x)
	System.out.printf("%s ", b);
	 System.out.println();
	 }
}
	
