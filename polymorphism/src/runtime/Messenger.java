package runtime;//overriding //child implement the methods in parent class 

public class Messenger {
	
	void send() { 
		System.out.println("Sending a generic message"); 
	}}
	
	class WhatsAppMassenger extends Messenger{
		void send() {
			System.out.println("Sending via WhatsApp");
		}}
		
		class EmailMessenger extends Messenger{
			void send() { 
				System.out.println( "Sending via Email"); 
			}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messenger messenger;
		
			
			messenger = new WhatsAppMassenger(); // upcasting 
			messenger.send(); 
			
			messenger = new EmailMessenger();  
			messenger.send();// upcasting 
			

	}

}
