package StrategyPattern;

public class PaymentMain {
    public static void main(String[] args) {
        MakePayment makePayment = new MakePayment();

        makePayment.setPaymentStrategy(new DebitCardStrategy());
        makePayment.makePayment();

        makePayment.setPaymentStrategy(new UPIStrategy());
        makePayment.makePayment();
    }
}
