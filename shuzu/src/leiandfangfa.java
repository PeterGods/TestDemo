/**
 * @author ：mmzs
 * @date ：Created in 2022/3/6 13:48
 * @description：
 * @modified By：
 * @version: $
 */
class Person{
    public static int x;
    private int age;
    private String name;
    public Person(){
        System.out.println("hh");
    }
    public Person(String name,int age){
        System.out.println(name+" "+age);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
 class Calculator{
    private int num1;
    private int num2;
    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public void setNum1(int num1){
        this.num1=num1;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public int sum(){
        return this.num1+this.num2;
    }
    public int minus(){
        return this.num1-this.num2;
    }
    public int ride(){
        return this.num1*this.num2;
    }
    public double divide(){
        return 1.0*this.num1/this.num2;
    }

}
public class leiandfangfa {
    public static void main(String[] args) {
       /* Calculator calculator=new Calculator();
        calculator.setNum1(10);calculator.setNum2(20);
        System.out.println(calculator.divide());*/
      /*  Person person=new Person("tong",10);
        person.setName("tongzhengqiang");
        System.out.println(person.getName());*/
        Person person=new Person();
        person.x++;
        System.out.println(Person.x);
    }
}
