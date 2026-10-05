package phase1;

/**
/** @author Jiho Shin */
 */
public abstract class Shape {
    private int x;
    private int y;

    public Shape() {
        this.x = 0;
        this.y = 0;
    }

    public Shape(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public abstract double getArea();

}
