package me.pujari.queue.ArrayQueue;

import me.pujari.queue.Interface.IQueue;

/**
 * @Author : Pushkarraj Pujari
 * @Since : 8/9/2017.
 */
public class AQueue implements IQueue {
    private int [] queue;
    private int queuePointer;

    public AQueue(){
        queue = new int[10];
        queuePointer = 0;
    }
    public void enqueue(int v){
        if(queuePointer > 9 ){
            System.out.println("Queue is Full");
        }else {
            queue[queuePointer++] = v;
        }
    }

    public int dequeue(){
        int temp = -1;
        if(queuePointer < 0){
            System.out.println("Queue is Empty");
        }else {
            temp = queue[0];
            for(int i =0; i < queuePointer - 1;i++){
                queue[i] = queue[i+1];
            }
            queuePointer--;
        }
        return temp;
    }

    public void print(){
        System.out.println("------------------------X-----------------------");
        for(int i = 0 ; i < queuePointer ; i++){
            System.out.println("Queue["+i+"] = "+queue[i]);
        }
        System.out.println("------------------------X-----------------------");
    }
}
