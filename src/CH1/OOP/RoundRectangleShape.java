package CH1.OOP;

public class RoundRectangleShape extends AbstractBoundingShape implements IShape {

    private float arcWidth;
    private float arcHeight;

    public RoundRectangleShape() {
    }

    public float getArcWidth() {
        return arcWidth;
    }

    public void setArcWidth(float arcWidth) {
        this.arcWidth = arcWidth;
    }

    public float getArcHeight() {
        return arcHeight;
    }

    public void setArcHeight(float arcHeight) {
        this.arcHeight = arcHeight;
    }

    @Override
    public void draw() {
        System.out.println("draw RoundRectangle");
    }

    @Override
    public boolean contains(int x, int y) {
        return false;
    }
}
