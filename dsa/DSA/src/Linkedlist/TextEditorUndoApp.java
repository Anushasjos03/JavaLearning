package Linkedlist;
class ActionNode {
    String action;
    ActionNode next;

    ActionNode(String action) {
        this.action = action;
    }
}

class ActionHistory {
    private ActionNode top = null;
    private int size = 0;

    public void addAction(String action) {
        if (action == null || action.trim().isEmpty()) {
            System.out.println("Invalid action.");
            return;
        }
        ActionNode newAction = new ActionNode(action);
        newAction.next = top;
        top = newAction;
        size++;
    }

    public void undo() {
        if (top == null) {
            System.out.println("No actions to undo.");
            return;
        }
        System.out.println("Undoing: " + top.action);
        top = top.next;
        size--;
    }

    public void showHistory() {
        if (top == null) {
            System.out.println("Action history is empty.");
            return;
        }

        ActionNode current = top;
        System.out.println("Action history:");
        while (current != null) {
            System.out.println("- " + current.action);
            current = current.next;
        }
    }

    public int getSize() {
        return size;
    }
}

public class TextEditorUndoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionHistory history = new ActionHistory();

        history.addAction("Typed 'Hello'");
        history.addAction("Deleted 'o'");
        history.addAction("Typed ' World'");
        
        history.showHistory();
        System.out.println("Total actions: " + history.getSize());

        history.undo();
        history.showHistory();
        System.out.println("Total actions: " + history.getSize());
	}

}
