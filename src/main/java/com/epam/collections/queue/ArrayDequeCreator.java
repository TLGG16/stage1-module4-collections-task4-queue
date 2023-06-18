package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> answ = new ArrayDeque<>();
        answ.add(firstQueue.poll());
        answ.add(firstQueue.poll());
        answ.add(secondQueue.poll());
        answ.add(secondQueue.poll());
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()){
            firstQueue.add( answ.pollLast());
            answ.add(firstQueue.poll());
            answ.add(firstQueue.poll());
            secondQueue.add( answ.pollLast());
            answ.add(secondQueue.poll());
            answ.add(secondQueue.poll());
        }
        return answ;
    }
}
