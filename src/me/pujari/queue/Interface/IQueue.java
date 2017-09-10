package me.pujari.queue.Interface;

/**
 * @Author : Pushkarraj Pujari
 * @Since  : 10-09-2017.
 */
public interface IQueue {
    public void enqueue(int v);
    public int dequeue();
    public void print();
}
