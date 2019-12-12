package CH4.CREATE_PATTERN.FactoryMethod;

public abstract class DrinksMachine {

    public abstract Drink dispenseDrink();

    public String displayMessage() {
        return "이용해주셔서 감사합니다.";
    }
}
