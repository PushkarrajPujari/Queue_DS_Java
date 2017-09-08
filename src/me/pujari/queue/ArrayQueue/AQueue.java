package me.pujari.queue.ArrayQueue;

/**
 * @Author : Pushkarraj Pujari
 * @Since : 8/9/2017.
 */
public class AQueue {
    private int [] queue;
    private int head;
    private int tail;

    public AQueue(){
        queue = new int[10];
        head  = tail = 0;
    }
    public void enqueue(int v){
        if((head == 0 && tail > queue.length) || head > 0 && tail+1 == head){
            System.out.println("Queue is Full");
        }else {
            queue[tail++] = v;
        }
    }

    public int dequeue(){
        int temp = -1;
        if(tail < 0){
            System.out.println("Queue is Empty");
        }else {
            temp = queue[0];
            for(int i =0; i < tail - 1;i++){
                queue[i] = queue[i+1];
            }
            tail--;
        }
        return temp;
    }

    public void print(){
        System.out.println("------------------------X-----------------------");
        for(int i = 0 ; i < tail ; i++){
            System.out.println("Queue["+i+"] = "+queue[i]);
        }
        System.out.println("------------------------X-----------------------");
    }

    public int incrementHead(){
        if((tail + 1) >= queue.length && head > 0){
            tail = 0 ;
            if(!((tail + 1) >= head)){

            }
        }else{

        }
    }

    public int incrementTail(){
        if((tail + 1) >= queue.length && head > 0){
            tail = 0 ;
            if(!((tail + 1) >= head)){

            }
        }else{

        }
        return 0;
    }

    public void restHead(){
        head = 0;
    }

    public void restTail(){
        tail = 0;
    }
}
