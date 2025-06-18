package LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> cities = new LinkedHashMap<>();
		cities.put("India", "DElhi");
		cities.put("USA","washington");
		cities.put("UK", "London");

		System.out.println("all entries:" + cities);
	}

}
