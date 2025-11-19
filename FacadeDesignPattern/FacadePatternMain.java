package FacadeDesignPattern;

import FacadeDesignPattern.Facade.OrderFacade;

public class FacadePatternMain {
    
    public static void main(String args[]) {

        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("SampleItem", "8888-8888-8888");
    }
}
