package com.bit.demo;

/**
 * @author ：mmzs
 * @date ：Created in 2022/3/12 21:55
 * @description：
 * @modified By：
 * @version: $
 */
 class Animal{
    protected String name;
    public int a=10;
    public Animal(String name){
        this.name=name;
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
        super.a=100;
    }
}
public class TestDemo {
     public TestDemo(){
         this.name="田昊";
         System.out.println(this.name);
     }
    public String name;
    public static void main(String[] args) {
        Bird bird=new Bird("hehe");
        System.out.println(bird.name);
        System.out.println(bird.a);
    }
    protected static void display(){
        System.out.println("hhh");
    }

}
