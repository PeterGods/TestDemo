package com.bit.demo;
/**
 * @author ：mmzs
 * @date ：Created in 2022/3/13 18:36
 * @description：
 * @modified By：
 * @version: $
 */
public class TestClass extends TestDemo {
    public String name="帅哥";
     public TestClass(){
         super();
     }
    public void func(){
         TestDemo testDemo=new TestClass();
        System.out.println(testDemo.name);
        testDemo.display();
    }
    public void func2(){
        System.out.println(super.name);
    }
    public static void main(String[] args) {
        TestClass testClass=new TestClass();
        testClass.func2();
        //testClass.func();

    }
}
