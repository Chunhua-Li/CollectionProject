package assignment3Task;

/**
 * The CourseList class creates two LinkedLists of Strings, manipulates the lists using appropriate methods,
 * and demonstrates the removal of duplicates.
 * The program follows a sequence of operations on the lists, including create a list, output the list,
 * uppercase conversion, sublist creation, elements deletion, output in reversed order,
 * sorting in alphabetical order, and removing duplicate elements.
 * @author Chunhua Li
 * @version 1.0 
 * @since Amozon corretto 17.0.8.1;
 * 
 */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;

public class CourseList {
	/**
	 * Main method demonstrating the usage of lists and various operations on them.
	 * @param args Command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {

		/*
		 * Adds courses to list1
		 */
		String[] courses = { "math", "english", "chemistry", "physics", "history", "geography" };
		LinkedList<String> list1 = new LinkedList<>(Arrays.asList(courses));
		//System.out.println(courses);
		//System.out.println(list1);
		/*
		 * Adds courses2 to list2
		 */
		String[] courses2 = { "religion", "arts", "accounting", "math", "programming", "biology" };
		LinkedList<String> list2 = new LinkedList<>(Arrays.asList(courses2));
		list1.addAll(list2);
		list2 = null;		

		System.out.println("Welcome Everyone to My Assignment 3. My name is Chunhua.");
		System.out.println();
		printList(list1);		

		System.out.printf("%nDisplaying names of courses in uppercase letters...%n%n");		
		listToUppercase(list1);
		printList(list1);

		System.out.printf("%nDeleting courses 4 to 6...%n%n");		
		LinkedList<String> sublist = new LinkedList<>(list1.subList(0, 4));
		LinkedList<String> sublist2 = new LinkedList<>(list1.subList(7, (list1.size())));
		sublist.addAll(sublist2);		
		printList(sublist);
	
		System.out.printf("%nHere is the current list of courses...%n%n");
		list1.clear();
		list1.addAll(sublist);
		printList(list1);
		
		System.out.printf("%nReversed List:%n");
		printReversedList(list1);		
		
		System.out.printf("%nSorted courses in alphabetical order...%n%n");				
		Collections.sort(list1);		
		printList(list1);
		
		System.out.printf("%nRemoving duplicate courses...%n%n");
		eliminateDuplicate(list1);
		printList(list1);
	}

	/**
	 * Prints the elements of the list.
	 * @param list The list to be printed.
	 */
	/*
	 * Outputs List contents
	 */
	public static void printList(List<String> list) {
		System.out.println("The list is:");
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
		System.out.print(iterator.next()+", ");
		}
		System.out.println();
	}

	/**
	 * Converts all elements of the list to uppercase.
	 * @param list The list to convert to uppercase.
	 */
	/*
	 * Locates String objects and converts to uppercase
	 */
	public static void listToUppercase(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			iterator.set(iterator.next().toUpperCase());
		}		
	}


	/**
	 * Eliminates duplicates elements from the list.
	 * @param list The list from which duplicates are to be removed
	 */
	public static void eliminateDuplicate(List<String> list) {		
	    Set<String> listWithoutDuplicate = new HashSet<>(list);
	    list.clear();
	    list.addAll(listWithoutDuplicate);
	}

	/**
	 * Creates a sublist of the provided list, deletes sublist items, and updates the original list. 
	 * @param list The original list
	 * @param i The starting index of the sublist(inclusive)
	 * @param j The ending index of the sublist (exclusive)
	 */
	/*
	 * Obtains a sublist and deletes sublist items.
	 */
	public static void getSublist(LinkedList<String> list, int i, int j) {		
		List<String> sublist= list.subList(i, j);
		sublist.clear();
	}

	/**
	 * Reverse the order of elements in the list
	 * @param list The list to be reversed
	 */
	/*
	 * Prints the list in reverse order
	 */
	public static void printReversedList(List<String> list) {
		Collections.reverse(list);
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.printf(iterator.next()+", "); 
		}
		System.out.println();
	}

}
