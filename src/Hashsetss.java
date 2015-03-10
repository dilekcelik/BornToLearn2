import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


// 16 - HashSet(it is collection, not dublicate items)
public class Hashsetss {
	public static void main(String[] args) {
	
	String[] things = {"apple", "bob", "ham", "bob", "bacon"};
	List<String> list = Arrays.asList(things);
	System.out.printf("%s ", list);
	System.out.println();
	
	//HASHSET: deletes dublicated items
	Set<String> set = new HashSet<String>(list);
	System.out.printf("%s ", set);
	
	 }
 }