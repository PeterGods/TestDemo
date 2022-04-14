/**
 * @author ：mmzs
 * @date ：Created in 2022/3/12 20:05
 * @description：
 * @modified By：
 * @version: $
 */
class Node{
    public int data;
    public Node next;
    public Node per;
    public Node(int data){
        this.data=data;
        this.next=null;
        this.per=null;
    }
}
public class MyLinkedList {
    public Node head;
    public Node tail;
    public void addFirst(int data){
        Node cur=new Node(data);
        if(this.tail==null){
            this.head=cur;
            this.tail=cur;
            return;
        }
        cur.next=this.head;
        this.head.per=cur;
        this.head=cur;
    }
    public void display(){
        Node tmp=this.head;
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
    }
    public void addLast(int data){
        Node cur=new Node(data);
        if(this.tail==null){
            this.head=cur;
            this.tail=cur;
            return;
        }
        this.tail.next=cur;
        cur.per=this.tail;
        this.tail=cur;
    }
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    public int size(){
        Node cur=this.head;
        int size=0;
        while(cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }
    public void addIndex(int data,int index){
        Node cur=new Node(data);Node tmp=this.head;Node node=null;
        if(index<0&&index>this.size()){
            return;
        }
        if(index==0){
            this.addFirst(data);
            return;
        }
        if(index==this.size()){
            this.addLast(data);
            return;
        }
        while(index>0){
            tmp=tmp.next;
            index--;
        }
        node=tmp.per;
        cur.per=node;
        cur.next=tmp;
        tmp.per=cur;
        node.next=cur;
    }
    public void remove(int key){
        Node tmp=this.head;
        while(tmp!=null){
            Node tmp1=tmp.next;
            if(tmp.data==key){
                if(tmp.per==null&&tmp.next==null){
                    this.head=null;
                    this.tail=null;
                    return;
                }
                if(tmp.next==null){
                    tmp.per.next=null;
                    this.tail=tmp.per;
                    tmp=tmp1;
                    continue;
                }
                if(tmp.per==null){
                    tmp.next.per=null;
                    this.head=tmp.next;
                    tmp=tmp1;
                    continue;
                }
                tmp.per.next=tmp.next;
                tmp.next.per=tmp.per;
            }
            tmp=tmp1;
        }
    }
    public void clean(){
        while(this.head!=null){
            Node tmp=this.head.next;
            this.head.next=null;
            this.head.per=null;
            this.head=tmp;
        }
        this.tail=null;
    }
}
