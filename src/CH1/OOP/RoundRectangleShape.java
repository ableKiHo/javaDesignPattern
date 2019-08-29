package CH1.OOP;

public class RoundRectangleShape extends AbstractBoundingShape {

    private float arcWidth;
    private float arcHeight;

    public void draw() {
        System.out.println("draw RoundRectangle");
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
}
