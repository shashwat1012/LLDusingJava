package FacadeDesignPattern.Subsystem;

public class InvoiceService {
    public void generateInvoice(String item) {
        System.out.println("Generating invoice for: " + item);
    }
}
