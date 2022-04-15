package Josephu;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/15 17:05
 * @description：
 * @modified By：
 * @version: $
 */
public class TestDemo {
    public static void main(String[] args) throws NumberException {
        CircleSingleLinkedList circleSingleLinkedList=new CircleSingleLinkedList();
        circleSingleLinkedList.addPeople(10);
        circleSingleLinkedList.show();
        circleSingleLinkedList.PlayGame(7);
    }

}
