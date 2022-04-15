package Experiment6;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/15 12:29
 * @description：
 * @modified By：
 * @version: $
 */
public class Micphone implements USB{
    @Override
    public void turnOn() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了");
    }
}
