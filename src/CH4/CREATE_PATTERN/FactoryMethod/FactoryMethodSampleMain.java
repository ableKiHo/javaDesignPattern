package CH4.CREATE_PATTERN.FactoryMethod;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FactoryMethodSampleMain {
    //TODO 객체를 생성하는 인터페이스를 정하되 어느 클래스를 인스터스화할지는 하위 클래스가 결정

    //TODO 클래스 인스턴스화를 하위 클래스에게 넘기게 한다.

    //TODO new 키워드를 쓸 일이 거의 없고 인스턴스화 과정에서 다른 실제 구현체를 한 겹 더 감쌀수 있다.
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza1 = pizzaFactory.createPizza("Tomato");
        System.out.println(pizza1.getName());
        System.out.println(pizzaFactory.displayMessage());
        Pizza pizza2 = pizzaFactory.createPizza("Pepperoni");
        System.out.println(pizza2.getName());
        System.out.println(pizzaFactory.displayMessage());

        DrinksMachine dm1 = new CoffeeMachine();
        Drink coffee = dm1.dispenseDrink();
        System.out.println(dm1.displayMessage());

        DrinksMachine dm2 = new SoftDrinkMachine();
        Drink soft = dm2.dispenseDrink();
        System.out.println(dm2.displayMessage());

        //TODO 팩토리 메소드패턴을 사용하는 이유는 클래스간의 결합도를 낮추기 위함. (확장이 편해짐)




    }
}
