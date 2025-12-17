package TemplateMethodPattern.PaymentTemplate;

public class PayToFriend extends PaymentFlow{
    
    @Override
    public void validateFlow() {
        System.out.println("PTF logic for validation");
    }
    @Override
    public void debitMoney() {
        System.out.println("PTF logic for debiting money");
    }
    @Override
    public void calculatePlatformFees() {
        System.out.println("PTF logic for calculating platform fees");
    }
    @Override
    public void creditMoney() {
        System.out.println("PTF logic for crediting money");
    }


}
