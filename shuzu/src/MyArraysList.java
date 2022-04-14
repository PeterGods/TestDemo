import java.util.Arrays;

/**
 * @author ：mmzs
 * @date ：Created in 2022/3/8 10:55
 * @description：
 * @modified By：
 * @version: $
 */
//throw new RuntimeException(" ");
 public class MyArraysList {
    public int[] elem;
    public int usedSize;
    public static final int capacity=10;
    public MyArraysList(){
        this.elem=new int [capacity];
        this.usedSize=0;
    }
    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i]+" ");
        }
    }
    private void CheckArrays(){
        if(this.elem.length==this.usedSize){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }

    }
    public void add(int pos,int num){
        CheckArrays();
     if(pos>this.usedSize||pos<0){
         System.out.println("输入错误：");
         return;
     }
        for (int i = this.usedSize-1; i >=pos ; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=num;
        this.usedSize++;
    }
    public boolean  contains(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if(toFind==this.elem[i]){
                return true;
            }
        }
        return false;
    }
    public int search(int num){
        for (int i = 0; i < this.usedSize; i++) {
            if(num==this.elem[i]){
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos){
        if(pos<0||pos>=this.usedSize||this.usedSize==0){
            return -1;
        }
        return this.elem[pos];
    }
    public int Size(){
        return this.usedSize;
    }
    public void remove(int num){
        int toRemove=search(num);
        if(toRemove<0||toRemove>=this.usedSize||toRemove==-1){
            return;
        }
        for (int i = toRemove; i < this.usedSize-1; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    public void clear(){
        this.usedSize=0;
    }
}