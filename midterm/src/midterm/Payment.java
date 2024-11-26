package midterm;

import java.util.Date;

//Payment processing
public class Payment {
	private String paymentId;
	private double amount;
	private String paymentMethod;
	private Date paymentDate;
	private PaymentStatus status;

	public Payment(double amount, String paymentMethod) {
		// Constructor
	}

	public void processPayment();
	public void generateInvoice();
}