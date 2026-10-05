package phase2;
import java.awt.Graphics;
/**
 * Programmer: Jiho Shin
 */
public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(double newRadius) {
        super();
        this.radius = newRadius;
    }

    public Circle(int newX, int newY, double newRadius) {
        super(newX, newY);
        this.radius = newRadius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String toString() {
        return "Circle: " + "(" + getX() + ", " + getY() + "), " + "Radius: " + this.radius;
    }
    public void drawShape(Graphics g) {
        g.drawOval(getX(), getY(), (int)(2 * radius), (int)(2 * radius));
        }
}