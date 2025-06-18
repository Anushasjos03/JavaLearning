package compileTime;// overload - same method name with different parent, no parent no child class compile time polymorphism 

public class MessageSenderCompiletime {
	
	void sendMessage(String message) {// void so that it doesn't have return type
		System.out.println("Sending text message:" + message);
	}
	
	void sendMessage(String message, String recipient) {
			System.out.println("Sending message to " + recipient+":"+ message);
			}


	void sendMessage(String message, boolean isUrgent) {
	if (isUrgent)
	System.out.println( "Urgent: " + message);
	else
	System.out.println("Sending message: "+ message);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSenderCompiletime sender = new MessageSenderCompiletime();//obj declaration//default constructor
		sender.sendMessage("Hellol");
		sender.sendMessage("Hello!", "Anusha");
		sender.sendMessage("Server downl", true);
	}

}
