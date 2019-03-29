package com.riswit.dpt.prototype2;

public class Apple extends SmartPhone {

    public Apple(String model) {
        this.setPrice(900);
        this.setModel(model);
    }

    @Override
    public SmartPhone clone() throws CloneNotSupportedException {
        return (Apple) super.clone();
    }
}
