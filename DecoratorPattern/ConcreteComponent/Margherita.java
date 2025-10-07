package DecoratorPattern.ConcreteComponent;

import DecoratorPattern.Component.BasePizza;

public class Margherita extends BasePizza{
    
    @Override
    public int cost() {
        return 150;
    }
}
