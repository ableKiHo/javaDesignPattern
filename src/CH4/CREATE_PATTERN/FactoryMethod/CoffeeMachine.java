package CH4.CREATE_PATTERN.FactoryMethod;

public class CoffeeMachine extends DrinksMachine {
    @Override
    public Drink dispenseDrink() {
        return new Coffee();
    }
}
