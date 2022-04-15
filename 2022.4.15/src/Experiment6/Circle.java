package Experiment6;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/15 9:55
 * @description：
 * @modified By：
 * @version: $
 */
public class Circle extends Shape{
    private double x;
    private double y;
    private double radius;

    public Circle(String color, double x, double y, double radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override

    public double getArea() {
        return 3.14*this.radius*this.radius;
    }
    @Override
    public double getVolume() {
        return 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

}
