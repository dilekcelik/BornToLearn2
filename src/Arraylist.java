import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class Arraylist {

	public static void main(String[] args) {
	//Collections, dynamic,
	//array
	String[] things = {"eggs", "lasers", "hats", "pie"};
	//Creation of List
	List<String> list = new ArrayList<String>();
	//adding array items to list
	for(String x: things)
	list.add(x);
	
	//another array and list
	String[] morethings= {"lasers", "hats"};
	List<String> list2 = new ArrayList<String>();
	for(String y: morethings)
	list2.add(y);
	
	//Lets print it out
	for(int i=0; i<list.size(); i++){
	System.out.printf("%s", list.get(i));
	}
	
	 //METHOD TANIMLIYORUZ
	editlist(list,list2);
	System.out.println();
	
	for(int i=0; i<list.size(); i++){
	System.out.printf("%s", list.get(i));
	}
	}
	
	//METHOD TANIMLIYORUZ(Bu method list`in icindeki list2`leri


	private static void editlist(List<String> list, List<String>list2) {
		// TODO Auto-generated method stub
	Iterator<String> it = list.iterator();
	while(it.hasNext()) {
	if(list2.contains(it.next()))
	it.remove();
	 }
}

}
