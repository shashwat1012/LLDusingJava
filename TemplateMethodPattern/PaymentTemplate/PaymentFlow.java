package TemplateMethodPattern.PaymentTemplate;

public abstract class PaymentFlow {
    
    public abstract void validateFlow();
    public abstract void debitMoney();
    public abstract void calculatePlatformFees();
    public abstract void creditMoney();

    public final void sendMoney() {
        validateFlow();
        debitMoney();
        calculatePlatformFees();
        creditMoney();
    }
}
