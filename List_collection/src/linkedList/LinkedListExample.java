package linkedList;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> tasks = new LinkedList<>();
		tasks.add(("task 1"));
		tasks.add("task 2");
		tasks.addFirst("Urgent task");

		System.out.println("First task : " + tasks.getFirst());

	}

}
