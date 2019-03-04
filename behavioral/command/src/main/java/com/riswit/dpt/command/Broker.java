package com.riswit.dpt.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> ordersList = new ArrayList<Order>();

    public void takeOrder(Order order){
        ordersList.add(order);
    }

    public void placeOrders(){
        for (Order order: ordersList){
            order.execute();
        }
        ordersList.clear();
    }
}
