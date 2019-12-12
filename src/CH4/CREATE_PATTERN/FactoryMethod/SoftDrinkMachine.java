package CH4.CREATE_PATTERN.FactoryMethod;

public class SoftDrinkMachine extends DrinksMachine {
    @Override
    public Drink dispenseDrink() {
        return new SoftDrink();
    }
}
