package Experiment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/15 9:40
 * @description：
 * @modified By：
 * @version: $
 */
public class TestDemo {
    public static void main(String[] args) {
        Circle circle=new Circle("红色",3.6,7.5,3.5);
        Cone cone=new Cone("蓝色",2.1,3.6,5.8,7.5);
        System.out.println(Cone.printinfo(cone));
        System.out.println(Cone.printinfo(circle));
        Computer computer=new Computer();
        Mouse mouse=new Mouse();
        Keyboard keyboard=new Keyboard();
        Micphone micphone=new Micphone();
        computer.add(mouse);
        computer.add(keyboard);
        computer.add(micphone);
        for (int i = 0; i < 3; i++) {
            computer.getUsb()[i].turnOn();
        }
        computer.powerOn();
        for (int i = 0; i <3 ; i++) {
            computer.getUsb()[i].turnOff();
        }
        computer.powerOff();
    }


    }

