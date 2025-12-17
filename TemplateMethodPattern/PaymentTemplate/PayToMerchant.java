package TemplateMethodPattern.PaymentTemplate;

public class PayToMerchant extends PaymentFlow{
    
    @Override
    public void validateFlow() {
        System.out.println("PTM logic for validation");
    }
    @Override
    public void debitMoney() {
        System.out.println("PTM logic for debiting money");
    }
    @Override
    public void calculatePlatformFees() {
        System.out.println("PTM logic for calculating platform fees");
    }
    @Override
    public void creditMoney() {
        System.out.println("PTM logic for crediting money");
    }
}
