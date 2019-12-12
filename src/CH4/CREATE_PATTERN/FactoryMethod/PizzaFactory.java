package CH4.CREATE_PATTERN.FactoryMethod;

public class PizzaFactory extends Factory {
    @Override
    public Pizza createPizza(String name) {
        switch (name) {
            case "Tomato" : return new TomatoPizza();
            case "Pepperoni" : return new PepperoniPizza();
        }
        return null;
    }

    public String displayMessage() {
        return "이용해주셔서 감사합니다.";
    }
}
