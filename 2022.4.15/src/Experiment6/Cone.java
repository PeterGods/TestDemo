package Experiment6;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/15 9:59
 * @description：
 * @modified By：
 * @version: $
 */
public class Cone extends Circle{
    private double height;

    public Cone(String color, double x, double y, double radius, double height) {
        super(color, x, y, radius);
        this.height = height;
    }

    public Cone(double x, double y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 3.14*getRadius()*getRadius()+Math.sqrt(getRadius()*getRadius()+this.height*this.height)*3.14*getRadius();
    }

    @Override
    public double getVolume() {
        return (3.14*getRadius()*getRadius()*this.height)/3;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "height=" + height +
                '}';
    }

    public static String printinfo(Cone o){
        return "Cone{" +
                "颜色'" + o.getColor() + '\'' +
                ",位置(+"+ o.getX()+","+o.getY()+")" +
                ", 半径" + o.getRadius() +
                ",高度" + o.height +
               ",面积"+o.getArea()+
                ",体积"+o.getVolume()+
                '}';
    }
    public static String printinfo(Circle o){
        return "Circle{" +
                "颜色'" + o.getColor() + '\'' +
                ",位置(+"+ o.getX()+","+o.getY()+")" +
                ", 半径" + o.getRadius() +
                ",面积"+o.getArea()+
                ",体积"+o.getVolume()+
                '}';
    }
}
