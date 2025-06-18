package PushBased;

import java.util.Stack;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> actions = new Stack<>();
		// Simulate drawing actions
		actions.push("Draw Line");
		actions.push("Draw Circle");
		actions.push("Draw Rectangle");
		System.out.println("Actions performed:");
		for (String action : actions) {
			System.out.println(action);
		}
	}

}
