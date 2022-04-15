package Experiment6;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/15 12:31
 * @description：
 * @modified By：
 * @version: $
 */
public class Computer{
    private USB[] usb=new USB[10];
    private int count=0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Computer(USB[] usb, int count) {
        this.usb = usb;
        this.count = count;
    }

    public Computer(USB[] usb) {
        this.usb = usb;
    }

    public Computer() {
    }

    public USB[] getUsb() {
        return usb;
    }

    public void setUsb(USB[] usb) {
        this.usb = usb;
    }

    public void add(USB usb){
        this.usb[count]=usb;
        count++;
    }
    public void powerOn(){
        System.out.println("电脑启动了");
    }
    public void powerOff(){
        System.out.println("电脑关闭了");
    }

}
