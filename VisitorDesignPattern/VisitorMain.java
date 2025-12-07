package VisitorDesignPattern;

import VisitorDesignPattern.Element.DoubleRoomElement;
import VisitorDesignPattern.Element.SingleRoomElement;
import VisitorDesignPattern.Visitor.RoomPricingVisitor;
import VisitorDesignPattern.Element.*;
import VisitorDesignPattern.Visitor.*;

public class VisitorMain {
    
    public static void main(String args[]) {
        RoomElement singleRoomElement = new SingleRoomElement();
        RoomElement doubleRoomElement = new DoubleRoomElement();
        RoomVisitor RoomPricingVisitor = new RoomPricingVisitor();
        singleRoomElement.accept(RoomPricingVisitor);
        System.out.println(((SingleRoomElement)singleRoomElement).roomPrice);
        doubleRoomElement.accept(RoomPricingVisitor);
        System.out.println(((DoubleRoomElement)doubleRoomElement).roomPrice);
        RoomVisitor RoomMaintainenceVisitor = new RoomMaintainenceVisitor();
        singleRoomElement.accept(RoomMaintainenceVisitor);
        doubleRoomElement.accept(RoomMaintainenceVisitor);
    }
}
