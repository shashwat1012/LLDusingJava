package DecoratorPattern;

import DecoratorPattern.Component.BasePizza;
import DecoratorPattern.ConcreteComponent.Margherita;
import DecoratorPattern.Decorator.CheeseDecorator;
import DecoratorPattern.Decorator.MushroomDecorator;

public class Store {
    
    public static void main(String args[]) {
        BasePizza basePizza = new Margherita();
        System.out.println(basePizza.cost());
        
        BasePizza CheesePizza = new CheeseDecorator(basePizza);
        System.out.println(CheesePizza.cost());

        BasePizza MushroomPizza = new MushroomDecorator(basePizza);
        System.out.println(MushroomPizza.cost());

        BasePizza fullyLoadedPizza = new CheeseDecorator(new MushroomDecorator(basePizza));
        System.out.println(fullyLoadedPizza.cost());
    }
}
