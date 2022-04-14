/**
 * @author ：mmzs
 * @date ：Created in 2022/3/12 20:19
 * @description：
 * @modified By：
 * @version: $
 */

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(10);
       // myLinkedList.addLast(100);
      /*  myLinkedList.addLast(120);
        myLinkedList.addIndex(1000,3);*/  myLinkedList.remove(10);
       // myLinkedList.addFirst(156);

        myLinkedList.display();

    }

}
