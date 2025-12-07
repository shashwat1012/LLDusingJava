package VisitorDesignPattern.Element;

import VisitorDesignPattern.Visitor.*;

public interface RoomElement {
    public void accept(RoomVisitor roomVisitor);
}
