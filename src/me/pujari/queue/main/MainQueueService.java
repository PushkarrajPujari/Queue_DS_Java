package me.pujari.queue.main;

import me.pujari.queue.ArrayQueue.AQueue;
import me.pujari.queue.Interface.IQueue;
import me.pujari.queue.LinkedListQueue.LQueue;

import java.util.Random;

/**
 * @Author : Pushkarraj Pujari
 * @Since 10-09-2017.
 */
public class MainQueueService {
    public static void main(String[] args) {
        IQueue iQueue = getQueueInstance();
        for(int i = 0 ; i< 10 ; i++){
            iQueue.enqueue(i);
        }
        iQueue.print();
        iQueue.dequeue();
        iQueue.print();
    }

    public static IQueue getQueueInstance() {
        if(new Random().nextInt() % 2 == 0){
            System.out.println("Array Queue");
            return new AQueue();
        }else {
            System.out.println("LinkedList Queue");
            return new LQueue();
        }
    }
}
