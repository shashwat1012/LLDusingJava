package StrategyPattern;

public class MakePayment {

    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(){
        paymentStrategy.makePayment();
    }
}
