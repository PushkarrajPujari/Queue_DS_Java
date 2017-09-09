package me.pujari.queue.main;

import me.pujari.queue.LinkedListQueue.LQueue;

/**
 * @Author : Pushkarraj Pujari
 * @Since : 09-09-2017.
 */
public class MainQueueLinkedList {
    public static void main(String[] args) {
        LQueue lQueue = new LQueue();
        lQueue.enqueue(10);
        lQueue.enqueue(20);
        lQueue.enqueue(30);
        lQueue.enqueue(40);
        lQueue.enqueue(50);
        lQueue.print();
        lQueue.dequeue();
        lQueue.print();
    }
}
