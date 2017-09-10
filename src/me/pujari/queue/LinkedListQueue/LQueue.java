package me.pujari.queue.LinkedListQueue;

import me.pujari.queue.Interface.IQueue;
import me.pujari.queue.LinkedList.NodeManager;

/**
 * @Author : Pushkarraj Pujari
 * @Since  : 09-09-2017.
 */
public class LQueue implements IQueue{
    private NodeManager nodeManager;
    private int dequeuedValue;

    public LQueue() {
        this.nodeManager = new NodeManager();
    }

    public void enqueue(int v){
        nodeManager.addNode(v);
    }
    public int dequeue(){
        dequeuedValue =nodeManager.removeNode();
        if(dequeuedValue != 'N'){
            System.out.println("Dequeued Value is "+dequeuedValue);
            return dequeuedValue;
        }else{
            System.out.println("Queue is empty");
            return -1;
        }
    }
    public void print(){
        nodeManager.print();
    }
}
