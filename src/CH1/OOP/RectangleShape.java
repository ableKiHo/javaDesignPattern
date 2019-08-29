package CH1.OOP;

public class RectangleShape extends AbstractBoundingShape implements IShape {

    public RectangleShape() {}

    @Override
    public void draw() {
        System.out.println("draw Rectangle");
    }

    @Override
    public boolean contains(int x, int y) {
        return false;
    }
}
