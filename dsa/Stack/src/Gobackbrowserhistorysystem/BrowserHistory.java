package Gobackbrowserhistorysystem;
import java.util.Stack;
public class BrowserHistory {
	private Stack<String> history = new Stack<>();

    // Push operation: Visit a new page
    public void pushPage(String url) {
        history.push(url);
        System.out.println("Visited: " + url);
        printHistory();
    }

    // Pop operation: Go back to previous page
    public void goBack() {
        if (history.size() > 1) {
            String current = history.pop();
            System.out.println("Going back from: " + current);
            System.out.println("Now on: " + history.peek());
        } else if (history.size() == 1) {
            System.out.println("You are at the first page. Cannot go back further.");
        } else {
            System.out.println("No history available.");
        }
        printHistory();
    }

    // Display the current stack (browser history)
    private void printHistory() {
        System.out.println("Current Browser History:");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println("- " + history.get(i));
        }
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserHistory browser = new BrowserHistory();
        browser.pushPage("https://google.com");
        browser.pushPage("https://openai.com");
        browser.pushPage("https://stackoverflow.com");

        browser.goBack(); // Go back from stackoverflow
        browser.goBack(); // Go back from openai
        browser.goBack(); // At first page, can't go back
	}

}
