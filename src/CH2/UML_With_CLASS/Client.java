package CH2.UML_With_CLASS;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        System.out.println(coffee.getName());

        coffee.display();

        Coffee espresso = new Espresso();
        espresso.setName("Espresso");

        System.out.println(espresso.getName());

        espresso.display();
    }
}
