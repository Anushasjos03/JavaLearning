package TicketCounterSystem;

import java.util.LinkedList;
import java.util.Queue;

public class TicketCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();
		// People arrive at the ticket counter
		queue.add("Alice");
		queue.add("Bob");
		queue.add("Charlie");
		System.out.println("People in the queue:");
		for (String person : queue) {
			System.out.println(person);
		}
	}

}
