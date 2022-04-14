import java.util.*;

/**
 * @author ：mmzs
 * @date ：Created in 2022/3/9 16:22
 * @description：
 * @modified By：
 * @version: $
 */
public class HomeWork2 {
    public static void month() {
        Random random = new Random();
        int i = random.nextInt(12) + 1;
        switch (i) {
            case 1:
                System.out.println(i + ":" + "January");
                break;
            case 2:
                System.out.println(i + ":" + "February");
                break;
            case 3:
                System.out.println(i + ":" + "March");
                break;
            case 4:
                System.out.println(i + ":" + "April");
                break;
            case 5:
                System.out.println(i + ":" + "May");
                break;
            case 6:
                System.out.println(i + ":" + "June");
                break;
            case 7:
                System.out.println(i + ":" + "July");
                break;
            case 8:
                System.out.println(i + ":" + "August");
                break;
            case 9:
                System.out.println(i + ":" + "September");
                break;
            case 10:
                System.out.println(i + ":" + "October");
                break;
            case 11:
                System.out.println(i + ":" + "November");
                break;
            case 12:
                System.out.println(i + ":" + "December");
                break;
            default:
                System.out.println("发生错误");
                break;
        }
    }
    public static void sortName(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first city:");
        String str=scanner.nextLine();
        System.out.println();
        System.out.print("Enter the second city:");
        String str2=scanner.nextLine();
        System.out.println();
        System.out.print("Enter the third city:");
        String str3=scanner.nextLine();
        System.out.println();
        String[] tmp=new String[3];
        tmp[0]=str;tmp[1]=str2;tmp[2]=str3;
        Arrays.sort(tmp);
        System.out.print("The three cities in alphabetical order are "+ tmp[0] +tmp[1] +tmp[2]);
    }
    public static void CountBuy(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的花费：");
        double Money = scanner.nextDouble();
        int Coupon=0;
        if (Money < 10.0) {
            Coupon = 0;
            System.out.println("您的折扣为：" + Coupon + "%");
        } else if (Money >= 10.0 && Money <= 60.0) {
            Coupon = 8;
            System.out.println("您的折扣为：" + Coupon+ "%");
        } else if (Money > 60.0 && Money <= 150) {
            Coupon = 10;
            System.out.println("您的折扣为：" + Coupon+ "%");
        } else if (Money > 150.0 && Money <= 210) {
            Coupon = 10;
            System.out.println("您的折扣为：" + Coupon + "%");
        } else {
            Coupon = 14;
            System.out.println("您的折扣为：" + Coupon + "%");
        }
    }
    public static void NumOf(){
        System.out.println("请输入一些数字（输入非数值结束）：");
        Scanner scanner=new Scanner(System.in);
        int tmp=0,NumOfEven=0,NumOfOdd=0;
        while(scanner.hasNextInt()){
            tmp=scanner.nextInt();
            if(tmp%2==0){
                NumOfEven++;
            }
            else{
                NumOfOdd++;
            }
        }
        scanner.close();
        System.out.println("偶数个数为:"+NumOfEven+" "+"奇数个数为："+NumOfOdd);
    }
    public static void main(String[] args) {
        CountBuy();16
    }

}
