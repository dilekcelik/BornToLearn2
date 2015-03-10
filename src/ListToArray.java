import java.util.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListToArray {
	public static void main(String[] args) {
		
		String[] stuff = {"babies", "watermelong", "melons", "fudge"};
		//array goes to list here
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		
		//added elemnts to list
		thelist.add("pumpkinnn");
		thelist.addFirst("firstthing");
		
		//convert back list to array
		stuff = thelist.toArray(new String[thelist.size()]);
		
		//print
		for(String x : stuff)
				System.out.printf("%s ", x );
	}
}
