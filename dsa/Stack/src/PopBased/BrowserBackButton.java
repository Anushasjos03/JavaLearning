package PopBased;

import java.util.Stack;

public class BrowserBackButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> history = new Stack<>();
		history.push("home.com");
		history.push("about.com");
		history.push("contact.com");
		System.out.println("Going back from: " + history.pop());
		System.out.println("Now on page: " + history.peek());
	}

}
