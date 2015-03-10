import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Collections;

public class ListAddAll {

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
	}
}

