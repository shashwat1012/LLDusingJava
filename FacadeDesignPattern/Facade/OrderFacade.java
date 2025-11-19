package FacadeDesignPattern.Facade;

import FacadeDesignPattern.Subsystem.InventoryService;
import FacadeDesignPattern.Subsystem.InvoiceService;
import FacadeDesignPattern.Subsystem.NotificationService;
import FacadeDesignPattern.Subsystem.PaymentService;
import FacadeDesignPattern.Subsystem.ShippingService;

public class OrderFacade {
    //now this facade will wrap the entire subsystem, interact with all the internal classes, and will expose only the relevant capabilities to the client
    private InventoryService inventoryService;
    private InvoiceService invoiceService;
    private NotificationService notificationService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.invoiceService = new InvoiceService();
        this.notificationService = new NotificationService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String item, String cardNumber) {
        //can implement actual checkstock and payment failure logic in the respective methods
        if(!inventoryService.checkstock(item)) {
            notificationService.sendNotification("Item out of Stock");
            return;
        }
        if(!paymentService.processPayment(cardNumber)){
            notificationService.sendNotification("Payment Failed");
            return;
        }
        invoiceService.generateInvoice(item);
        shippingService.shipItem(item);
        notificationService.sendNotification("Order placed successfully");
    }

}
