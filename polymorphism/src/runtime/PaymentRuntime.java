package runtime;

public class PaymentRuntime {
	void pay() {
		System.out.println("Generic payment processed");

	}
}
	class CreditCardPayment extends PaymentRuntime {
		void pay() {
			System.out.println("Payment done via Credit Card");
		}
	}

	class UPIPayment extends PaymentRuntime {
		void pay() { 
			System.out.println("Payment done via UPI");
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 PaymentRuntime payment; 
		 payment =new CreditCardPayment();//upcasting
		 payment.pay();  
		 payment =new UPIPayment();
		 payment.pay();
		
		
	}

	}
