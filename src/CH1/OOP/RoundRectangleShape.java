package CH1.OOP;

public class RoundRectangleShape {

    //클래스 멤버변수
    private static int shapeIdCounter = 0;

    private int x;
    private int y;

    private int width;
    private int height;

    private float arcWidth;
    private float arcHeight;

    //클래스 메서드
    public static int getShapeIdCounter() {
        return shapeIdCounter++;
    }

    public RoundRectangleShape() {
    }

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
