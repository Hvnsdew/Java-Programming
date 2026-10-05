package phase1;

/**
 * Programmer: Jiho Shin
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double newWidth, double newHeight) {
        super();
        this.width = newWidth;
        this.height = newHeight;

    }

    public Rectangle(int newX, int newY, double newWidth, double newHeight) {
        super(newX, newY);
        this.width = newWidth;
        this.height = newHeight;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle: " + "(" + getX() + ", " + getY() + "), " + "width: " + this.width + ", height: " + this.height;
    }

}
