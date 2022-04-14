/**
 * @author ：mmzs
 * @date ：Created in 2022/3/8 10:53
 * @description：
 * @modified By：
 * @version: $
 */

public class TestDemo {
    public static void main(String[] args) {
     MyArraysList myArraysList=new MyArraysList();
    /* myArraysList.add(0,10);
     myArraysList.add(1,10);
     myArraysList.add(2,10);*/
        for (int i = 0; i <10 ; i++) {
            myArraysList.add(i,i);
        }
        myArraysList.add(8,100);
        System.out.println(myArraysList.search(55));
        myArraysList.display();
        myArraysList.remove(100);
        myArraysList.display();

    }
}
