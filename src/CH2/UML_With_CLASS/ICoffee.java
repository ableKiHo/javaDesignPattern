package CH2.UML_With_CLASS;

public interface ICoffee {
    public String getName();

    public void setName(String name);

    public void display();

    public default String test(Long a) {
        return a.toString();
    }

    public default Long t(String s) {
        return Long.parseLong(s);
    }
}
