package VisitorDesignPattern.Visitor;

import VisitorDesignPattern.Element.DoubleRoomElement;
import VisitorDesignPattern.Element.SingleRoomElement;

public interface RoomVisitor {
    public void visit(SingleRoomElement singleRoomElement);
    public void visit(DoubleRoomElement doubleRoomElement);
}
