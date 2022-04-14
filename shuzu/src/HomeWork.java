import java.util.*;
import java.text.SimpleDateFormat;


/**
 * @author ：mmzs
 * @date ：Created in 2022/3/6 21:20
 * @description：
 * @modified By：
 * @version: $
 */

public class HomeWork {
    public static void Circle(){
        Scanner scanner=new Scanner(System.in);
        double r= scanner.nextDouble();
        double s=3.14*r*r;
        System.out.println("圆的面积"+s);
    }
    public static void LeapYear(){
        Scanner scanner1=new Scanner(System.in);
        int year=scanner1.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year+"年是闰年");
        }
        else{
            System.out.println(year+"年不是润年");
        }
    }
    public static void TwelveAnimals(){
        Scanner scanner2=new Scanner(System.in);
        int year=scanner2.nextInt();
         int tmp=(year-4)%12;
           switch(tmp){
            case 0:
                System.out.println("鼠");
                break;
            case 1:
                System.out.println("牛");
                break;
            case 2:
                System.out.println("虎");
                break;
            case 3:
                System.out.println("兔");
                break;
            case 4:
                System.out.println("龙");
                break;
            case 5:
                System.out.println("蛇");
                break;
            case 6:
                System.out.println("马");
                break;
            case 7:
                System.out.println("羊");
                break;
            case 8:
                System.out.println("猴");
                break;
            case 9:
                System.out.println("鸡");
                break;
            case 10:
                System.out.println("狗");
                break;
            case 11:
                System.out.println("猪");
                break;

        }
    }
    public static void Time(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date=new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }
    public static void main(String[] args) {

    }
}
