package phase1;

/**
 * Programmer: Jiho Shin
 */
public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle() {
        super();
        this.base = 1;
        this.height = 1;
    }

    public Triangle(double newBase, double newHeight) {
        super();
        this.base = newBase;
        this.height = newHeight;
    }

    public Triangle(int newX, int newY, double newBase, double newHeight) {
        super(newX, newY);
        this.base = newBase;
        this.height = newHeight;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double newBase) {
        this.base = newBase;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double getArea() {
        return (this.base / 2) * this.height;
    }

    public String toString() {
        return "Triangle: " + "(" + getX() + ", " + getY() + "), " + "base: " + this.base +  ", height: " + this.height;
    }
}
