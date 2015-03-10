import java.util.*;
import java.util.Arrays;
import java.util.Collections;


public class ListFrequencyDisjoint {
	public static void main(String[] args) {
	 //convert stuff array to list
	String[] stuff = {"apples", "beef", "corn", "ham"};
	List<String> list1 = Arrays.asList(stuff); //Array`i liste attik
	
	//diger array
	 ArrayList<String> list2 = new ArrayList<String>();
	 list2.add("youtube");
	 list2.add("google");
	 list2.add("digg");
	
	for(String x: list2)
	System.out.printf("%s ", x);
	
	//takes all elements in list2 and sends to stuff
	Collections.addAll(list2, stuff);
	
	for(String y: list2)
	System.out.printf("%s ", y);
	
	 //FREQUENCY
	System.out.println(Collections.frequency(list2, "digg"));
	//DISJOINT
	boolean tof = Collections.disjoint(list1, list2);
	System.out.println(tof);
	
	if(tof)
	System.out.println("these list do not have anything in comman");
	else
	System.out.println("these list must have anything in comman");
	
	}
}
