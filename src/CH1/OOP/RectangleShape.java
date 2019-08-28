package CH1.OOP;

public class RectangleShape {
    //멤버변수
    private int x;
    private int y;

    private int width;
    private int height;

    //생성자
    public RectangleShape() {
    }

    public RectangleShape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //메서드
    public void draw() {
        System.out.println("draw Rectangle");
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
}
