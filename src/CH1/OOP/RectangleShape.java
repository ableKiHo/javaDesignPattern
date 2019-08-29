package CH1.OOP;

public class RectangleShape extends AbstractBoundingShape{

    public RectangleShape() {
    }

    //추상메서드를 오버라이딩하여 기능을 확장한다.
    public void draw() {
        System.out.println("draw Rectangle");
    }

}
