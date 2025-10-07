package DecoratorPattern.Decorator;

import DecoratorPattern.Component.BasePizza;

public class CheeseDecorator extends PizzaDecorator{
    BasePizza basePizza;
    
    public CheeseDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
