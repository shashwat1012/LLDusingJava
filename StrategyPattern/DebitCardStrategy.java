package StrategyPattern;

public class DebitCardStrategy implements PaymentStrategy{

    public void makePayment(){
        System.out.println("Making payment through Debit Card");
    }
}
