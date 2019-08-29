package CH1.OOP;

public class RoundRectangleShape implements IDrawable {

    private int x;
    private int y;

    private int width;
    private int height;

    private float arcWidth;
    private float arcHeight;

    public RoundRectangleShape() {
    }

    @Override
    public void draw() {
        System.out.println("draw RoundRectangle");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
