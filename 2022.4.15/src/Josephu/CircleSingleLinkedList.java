package Josephu;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/15 17:08
 * @description：
 * @modified By：
 * @version: $
 */
public class CircleSingleLinkedList {
    private People firstPeople;
    public void addPeople(int num) throws NumberException {
        People perPeople=null;
        if(num<=1){
            throw new NumberException("输入数字有误");
        }
        for (int i = 1; i <= num; i++) {
            People people=new People(i);
            if(i==1) {
                if(this.firstPeople==null) {
                    this.firstPeople = people;
                    this.firstPeople.setNext(this.firstPeople);
                    perPeople = people;
                }else{
                    People TmpPeople1=this.firstPeople;
                    while(TmpPeople1.getNext()!=this.firstPeople){
                        TmpPeople1=TmpPeople1.getNext();
                    }
                    perPeople=TmpPeople1;
                }
            }
            else{
               perPeople.setNext(people);
               people.setNext(this.firstPeople);
               perPeople=perPeople.getNext();
            }
        }
    }
    public void show(){
        if(this.firstPeople==null){
            throw new NullPointerException("传入的指针为空");
        }
        People tmpPeople=this.firstPeople;
        while(true){
            System.out.println(tmpPeople.getNumber());
            if(this.firstPeople.equals(tmpPeople.getNext())){
                break;
            }
            tmpPeople=tmpPeople.getNext();
        }
    }
    public void PlayGame(int k) throws NumberException {
        if(k<=0){
            throw new NumberException("输入数字有误");
        }
        if(this.firstPeople==null){
            throw new  NullPointerException("该链表为空");
        }
        People tmpPeople = this.firstPeople;
        People perPeople = this.firstPeople;
        while(!perPeople.equals(perPeople.getNext())) {
            int tmp = k;
            while (tmp > 1) {
                perPeople = tmpPeople;
                tmpPeople = tmpPeople.getNext();
                tmp--;
            }
            System.out.print(tmpPeople.getNumber() + "->");
            if(tmpPeople.equals(this.firstPeople)){
                this.firstPeople=this.firstPeople.getNext();
            }
            perPeople.setNext(tmpPeople.getNext());
            tmpPeople=tmpPeople.getNext();
            perPeople=tmpPeople;
        }
        System.out.println(perPeople.getNumber());
    }
}
