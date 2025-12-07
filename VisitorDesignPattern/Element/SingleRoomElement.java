package VisitorDesignPattern.Element;

import VisitorDesignPattern.Visitor.RoomVisitor;

public class SingleRoomElement implements RoomElement{

    public int roomPrice;
    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this); //java double dispatch coming into play here, the method visit depends on both the caller and the argument
    }

}
