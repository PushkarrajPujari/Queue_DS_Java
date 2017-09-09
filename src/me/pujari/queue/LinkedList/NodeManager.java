package me.pujari.queue.LinkedList;

/**
 * @Author : Pushkarraj Pujari
 * @Since 09-09-2017.
 */
public class NodeManager {
    private Node head;
    private Node tail;

    public void addNode(int v){
        if(head == null){
            head = tail= new Node(v,head);
        }else{
            tail.setNext(new Node(v,null));
            tail = tail.getNext();
        }
    }

    public int removeNode(){
        int temp = 'N';
        if(head != null){
            temp = head.getValue();
            head = head.getNext();
        }
        return temp;
    }

    public void print(){
        Node temp = head;
        while(head!=null){
            System.out.println("Printing Queue = "+head.getValue());
            head = head.getNext();
        }
        head = temp;
    }
}
