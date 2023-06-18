package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> answ = new ArrayList<>();
        Queue<Integer> dishes = new LinkedList<>();
        for (int i = 0; i < numberOfDishes; i++) {
            dishes.add(i+1);
        }
        int counter =1;
        while (!dishes.isEmpty()){
            if (counter==everyDishNumberToEat){
                answ.add(dishes.poll());
                counter=1;
            }else {
                dishes.add(dishes.poll());
                counter++;
            }
        }
        return answ;
    }
}
