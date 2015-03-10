
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

	public class CollectionsSortt {
		public static void main(String[] args) {
			String[] crap = {"apples", "lemons", "geese", "bacon", "youtube"};
			List<String> l1 = Arrays.asList(crap); //easier way to convert list

			Collections.sort(l1); // modifies list
			System.out.printf("%s\n", l1);
			//RESULT: [apples, bacon, geese, lemons, youtube]

		Collections.sort(l1, Collections.reverseOrder()); //sirasini ters cevirir
		System.out.printf("%s\n", l1);
	 //RESULT: [youtube, lemons, geese, bacon, apples]
	 }
	}