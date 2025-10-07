package DecoratorPattern.Decorator;

import DecoratorPattern.Component.BasePizza;


public class MushroomDecorator extends PizzaDecorator{
    
    BasePizza basePizza;
    public MushroomDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
