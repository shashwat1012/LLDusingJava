package StrategyPattern;

public class UPIStrategy implements PaymentStrategy{

    public void makePayment(){
        System.out.println("Making payment through UPI");
    }
}
