package Experiment6;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/15 12:30
 * @description：
 * @modified By：
 * @version: $
 */
public class Keyboard implements USB{
    @Override
    public void turnOn() {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭了");
    }
}
