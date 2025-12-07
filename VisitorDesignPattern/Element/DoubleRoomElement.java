package VisitorDesignPattern.Element;

import VisitorDesignPattern.Visitor.RoomVisitor;

public class DoubleRoomElement implements RoomElement{
    
    public int roomPrice;
    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }
}
