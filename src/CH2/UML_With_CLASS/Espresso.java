package CH2.UML_With_CLASS;

public class Espresso {
    private String name = "Espresso";

    public Espresso() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(this.name);
    }
}
