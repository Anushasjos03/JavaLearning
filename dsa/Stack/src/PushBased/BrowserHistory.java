package PushBased;

import java.util.Stack;

public class BrowserHistory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> history = new Stack<>();
		// Simulate user visiting pages
		history.push("google.com");
		history.push("youtube.com");
		history.push("openai.com");
		System.out.println("Current browser history:");
		for (String page : history) {
			System.out.println(page);
		}
	}

}
