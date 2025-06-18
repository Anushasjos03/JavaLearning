package treeSet;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> products = new TreeSet<>();
		products.add("Laptop");
		products.add("Phone");
		products.add("charger");

		System.out.println("Sorted Products" + products);// charger ,laptop,phone
	}

}
