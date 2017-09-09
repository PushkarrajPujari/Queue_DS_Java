package me.pujari.queue.LinkedList;

/**
 * Created by Pushkarraj on 09-09-2017.
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value,Node next){
        this.value = value;
        this.next = next;
    }

    public int getValue(){
        return this.value;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
