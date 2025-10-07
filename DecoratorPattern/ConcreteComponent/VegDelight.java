package DecoratorPattern.ConcreteComponent;

import DecoratorPattern.Component.BasePizza;

public class VegDelight extends BasePizza{
    
    @Override
    public int cost() {
        return 100;
    }
}
