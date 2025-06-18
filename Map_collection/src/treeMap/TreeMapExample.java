package treeMap;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> codes = new TreeMap<>();
		codes.put(92,"India");
		codes.put(1,"USA");
		codes.put( 44,"UK");

		System.out.println("Sorted codes:" + codes);
	}

}
