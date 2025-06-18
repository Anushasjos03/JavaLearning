package set;

import java.util.*;
public class SortedRollNumbers {

	public static void main(String[] args) {
		
		SortedSet<Integer> rollNumbers = new TreeSet<>();
		rollNumbers.add(105);
		rollNumbers.add(101);
		rollNumbers.add(103);//duplicate,won't be added

		System.out.println("Sorted Roll Numbers:"+ rollNumbers);
		
	}

}
