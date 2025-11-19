package FacadeDesignPattern.Subsystem;

public class PaymentService {
    public boolean processPayment(String cardNumber) {
        System.out.println("Processing payment for card: " + cardNumber);
        return true;
    }
}
