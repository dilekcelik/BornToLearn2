import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListCopyReverse {
public static void main(String[] args) {
//create an array and convert to list
Character[] ray = {'p','w','n'};
List<Character> l = Arrays.asList(ray); //easier way to
System.out.println("List is: ");
output(l);
System.out.println();

//reverse and print out the list
Collections.reverse(l);
System.out.println("After reverse: ");
output(l);
System.out.println();

//create new array and new list
Character[] newRay = new Character[3];
List<Character> listCopy = Arrays.asList(newRay); //easier way to convert list

//copy contents of list into listCopy, Takes everynihg from
Collections.copy(listCopy, l);
System.out.println("Copy of list: ");
output(listCopy);
System.out.println();

//fill collection with crap
Collections.fill(l, 'X');
System.out.println("After filling the list: ");
output(l);
}

//OUTPUT METHOD
private static void output(List<Character> thelist) {
for(Character thing: thelist)
System.out.printf("%s ", thing);

}
}