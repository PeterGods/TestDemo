package Experiment6;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/15 9:52
 * @description：
 * @modified By：
 * @version: $
 */
public abstract class Shape {
    public final int a=10;
    private String color;
    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getVolume();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
