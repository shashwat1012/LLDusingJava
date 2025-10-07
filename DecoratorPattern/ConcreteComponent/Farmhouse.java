package DecoratorPattern.ConcreteComponent;

import DecoratorPattern.Component.BasePizza;

public class Farmhouse extends BasePizza {
    
    @Override
    public int cost() {
        return 200;
    }
}
