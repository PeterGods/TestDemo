import java.util.*;
import java.lang.System;

/**
 * @author ：mmzs
 * @date ：Created in 2022/3/5 10:29
 * @description：
 * @modified By：
 * @version: $
 */
class Pperson{
    public static int size=10;
}
public class arraySecond {
    public static void main(String[] args) {
        Pperson person=new Pperson();
        Pperson.size=100;
        System.out.println(Pperson.size);

    }
    public static void main4(String[] args) {
        int[][] ret={{1,2,3},{4,5,6}};
        int[][] ret1=new int[2][3];
        System.out.println(Arrays.toString(ret[0]));
        System.out.println(Arrays.deepToString(ret));
        for (int[] tmp:ret) {
            for (int c: tmp) {
                System.out.print(c+" ");
            }

        }
    }
    public static void MySort(int[] tmp){
        int left=0,right= tmp.length-1;
        while(tmp[left]%2==0&&left<right){
            left++;
        }
        while(tmp[right]%2!=0&&left<right){
            right--;
        }
        if(right>left){
            int a=tmp[right];
            tmp[right]=tmp[left];
            tmp[left]=a;
        }
    }
    public static void main3(String[] args) {
        int[] ret={1,2,4,8,9,5,6,7,8,5,6,3};
        MySort(ret);
        System.out.println(Arrays.toString(ret));
    }
    public static int FindInt(int[] tmp,int k){
        Arrays.sort(tmp);
        int left=0,right=tmp.length-1;
        while(right>=left){
            int middle=(right+left)/2;
            if(tmp[middle]<k){
                left=middle+1;

            }
            else if(tmp[middle]>k){
                right=middle-1;
            }
            else{
                return middle;
            }
        }
    return -1;
    }
    public static void main2(String[] args) {
        //Scanner scanner=new Scanner(System.in);
        //int k=scanner.nextInt();
        int[] ret={20,19,43,86,5,89,65,45,25};
        //int tmp=FindInt(ret,89);
        Arrays.sort(ret);
        int tmp=Arrays.binarySearch(ret,25);
        System.out.println(tmp);
    }
    public static int[] CopyArray(int[] tmp){
        int[] TemporaryArray=new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            TemporaryArray[i]=tmp[i];
        }
        return TemporaryArray;
    }
    public static void main1(String[] args) {
        int[] ret=new int[]{1,2,3,4,5,6,7,8,9};
        int[] tmp1=CopyArray(ret);//第一种拷贝数组方法
        int[] tmp2=Arrays.copyOf(ret,ret.length);//第二种拷贝数组的方法，用到了Arrays类
        int[] tmp3=new int[ret.length];
        System.arraycopy(ret,0,tmp3,0,ret.length);//数组拷贝第三种方法，运用System类
        int[] tmp4=ret.clone();//数组拷贝第四种方法克隆法
        System.out.println(Arrays.toString(tmp1));
        System.out.println(Arrays.toString(tmp2));
        System.out.println(Arrays.toString(tmp3));
        System.out.println(Arrays.toString(tmp4));
    }
}
