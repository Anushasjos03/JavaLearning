package Linkedlist;

class Customer {
	String name;
	Customer next;

	Customer(String name) {
		this.name = name;
	}
}

class BankQueue {
	private Customer front = null, rear = null;
	private int size = 0;

	public void addCustomer(String name) {
		if (name == null || name.trim().isEmpty()) {
			System.out.println("Invalid customer name.");
			return;
		}
		Customer newCustomer = new Customer(name);
		if (rear == null) {
			front = rear = newCustomer;
		} else {
			rear.next = newCustomer;
			rear = newCustomer;
		}
		size++;
	}

	public void serveCustomer() {
		if (front == null) {
			System.out.println("No customers in the queue.");
			return;
		}
		System.out.println("Serving: " + front.name);
		front = front.next;
		if (front == null)
			rear = null;
		size--;
	}

	public void showQueue() {
		Customer current = front;
		System.out.println("Current queue:");
		if (current == null) {
			System.out.println("- (empty)");
		}
		while (current != null) {
			System.out.println("- " + current.name);
			current = current.next;
		}
	}

	public void peek() {
		if (front != null) {
			System.out.println("Next to be served: " + front.name);
		} else {
			System.out.println("No customers in the queue.");
		}
	}

	public int getSize() {
		return size;
	}
}

public class BankQueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankQueue queue = new BankQueue();
		queue.addCustomer("Alice");
		queue.addCustomer("Bob");
		queue.addCustomer("Charlie");
		queue.showQueue();

		queue.peek();
		System.out.println("Queue size: " + queue.getSize());

		queue.serveCustomer();
		queue.showQueue();

		queue.peek();
		System.out.println("Queue size: " + queue.getSize());
	}

}
