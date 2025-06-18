package exceptionhandling;
import java.io.*;

public class PaymentProcessor {
	public void processPayment(double amount) throws IllegalArgumentException{
		
		try {
			if(amount <= 0) {
				throw new IllegalArgumentException("Amount must be greater than zero");
			}
			System.out.println("Processing payment of $"+ amount);
		}
		catch(IllegalArgumentException ex) {
			System.out.println("error:"+ ex.getMessage());
			throw ex;
		}
		finally {
			System.out.println("payment attempt completed");
		}
		 
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor processor = new PaymentProcessor();
		try {
			processor.processPayment(-100) ;
        } catch (IllegalArgumentException ex) {
            System.out.println("Handled in main: " + ex.getMessage());
        }			
			
			
	}

}
