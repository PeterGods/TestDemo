package com.bit.demo;

import java.util.Arrays;

/**
 * @author ：mmzs
 * @date ：Created in 2022/3/14 16:43
 * @description：
 * @modified By：
 * @version: $
 */
class Hobby implements Cloneable{
    public double a=30.14;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student extends Hobby implements Comparable,Cloneable{
    public String name;
    public int age;
    public int score;
    Hobby hobby=new Hobby();
    public Student(String name,int age,int score){
        this.name=name;
        this.age=age;
        this.score=score;
    }

    @Override
    public int compareTo(Object o) {
        if(this.age<((Student)o).age){
            return 1;
        }
        else if (this.age==((Student)o).age){
            return 0;
        }
        else{
            return -1;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student p=(Student) super.clone();
        p.hobby=(Hobby) this.hobby.clone();
        return p;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

public class Testdemo3 {
    public static int a=10;
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1=new Student("同中国",18,600);
        Student student2=new Student("田昊",19,610);
        Student student3=new Student("王明明",10,50);
        Student student4=(Student) student1.clone();
        student4.hobby.a=100.2;
        System.out.println(student1.hobby.a);
       // System.out.println(a);
     /* Student student1=new Student("童政强",18,600);
        Student student2=new Student("田昊",19,610);
        Student student3=new Student("王明明",10,50);
        Student[] students=new Student[3];
        students[0]=student1;students[1]=student2;students[2]=student3;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));*/
      /*  for (Student student:students) {
            System.out.println(student.name);
        }*/
        //System.out.println(Student.c);

    }
}
