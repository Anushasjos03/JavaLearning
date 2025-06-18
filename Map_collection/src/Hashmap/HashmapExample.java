package Hashmap;

import java.util.HashMap;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> marks = new HashMap<>();
		marks.put("Alice", 85);
		marks.put("Bob", 95);
		marks.put("Charlie", 78);

		System.out.println("alice's marks:" + marks.get("Alice"));
	}

}
