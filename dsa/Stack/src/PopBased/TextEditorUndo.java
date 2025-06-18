package PopBased;

import java.util.Stack;

public class TextEditorUndo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> actions = new Stack<>();
		actions.push("Typed A");
		actions.push("Typed B");
		actions.push("Deleted A");
		System.out.println("Undoing last action: " + actions.pop());
		System.out.println("Remaining actions:");
		for (String action : actions) {
			System.out.println(action);
		}
	}

}
