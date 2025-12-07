package VisitorDesignPattern.Visitor;

import VisitorDesignPattern.Element.DoubleRoomElement;
import VisitorDesignPattern.Element.SingleRoomElement;

public class RoomPricingVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoomElement singleRoomElement) {
        System.out.println("Pricing logic for Single Room");
        singleRoomElement.roomPrice = 100;
    }

    @Override
    public void visit(DoubleRoomElement doubleRoomElement) {
        System.out.println("Pricing logic for Double Room");
        doubleRoomElement.roomPrice = 200;
    }
}
