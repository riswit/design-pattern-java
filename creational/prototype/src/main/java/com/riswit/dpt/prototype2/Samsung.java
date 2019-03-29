package com.riswit.dpt.prototype2;

public class Samsung extends SmartPhone {
    public Samsung(String model) {
        this.setPrice(700);
        this.setModel(model);
    }

    @Override
    public SmartPhone clone() throws CloneNotSupportedException {
        return (Samsung) super.clone();
    }
}
