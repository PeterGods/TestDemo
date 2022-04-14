package com.bit.demo;

/**
 * @author ：mmzs
 * @date ：Created in 2022/3/14 10:55
 * @description：
 * @modified By：
 * @version: $
 */
interface Money{
    public void func();
}
class Tmp implements Money{
    public void func(){
        System.out.println("kk");
    }
}
 class person{
    public  int a=100;
    public String name;
    public double c;
    //public abstract void func();
    public person(String name){
        this.name=name;
    }

    public  void func(){
        System.out.println(a);
    }
}
class A extends person{
    public  String name="ll";
    public A(String name){
        super(name);
    }
    public  void func() {
        System.out.println(name);
    }
    public void func2(){
        System.out.println("ee");
    }
}
class Shape{
    public void draw(){
        System.out.println("aa");
    }

}
class circle extends  Shape{
    @Override
    public void draw() {
        super.draw();
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
      /*  Shape shape1=new circle();
        shape1.draw();*/
        person a=new A("童政强");
        a.func();
        //a.name;
        //System.out.println(a.name);
        /*Money money=new Tmp();
        money.func();*/
    }

}
