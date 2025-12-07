package VisitorDesignPattern.Visitor;

import VisitorDesignPattern.Element.DoubleRoomElement;
import VisitorDesignPattern.Element.SingleRoomElement;

public class RoomMaintainenceVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoomElement singleRoomElement) {
        System.out.println("Maintainence logic for Single Room");
    }

    @Override
    public void visit(DoubleRoomElement doubleRoomElement) {
        System.out.println("Maintainence logic for Double Room");
    }

}
