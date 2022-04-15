package Josephu;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/15 17:08
 * @description：
 * @modified By：
 * @version: $
 */
public class People {
    private int number;
    private People next;
    public People(int number, People people) {
        this.number = number;
        this.next = people;
    }

    public People(int number) {
        this.number = number;
    }

    public People() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public People getNext() {
        return next;
    }

    public void setNext(People next) {
        this.next = next;
    }
}
