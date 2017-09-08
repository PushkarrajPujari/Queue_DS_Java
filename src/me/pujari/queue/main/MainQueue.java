package me.pujari.queue.main;

import me.pujari.queue.ArrayQueue.AQueue;

/**
 * @Author : Pushkarraj Pujari
 * @Since : 8/9/2017.
 */
public class MainQueue {
    public static void main(String[] args) {
        AQueue aQueue = new AQueue();
        aQueue.enqueue(10);
        aQueue.enqueue(20);
        aQueue.enqueue(30);
        aQueue.enqueue(40);
        aQueue.enqueue(50);
        aQueue.print();
        aQueue.dequeue();
        aQueue.print();
    }
}
