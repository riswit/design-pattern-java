package com.riswit.dpt.singleton2;

public class SingletonDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        ClassicSingleton object = ClassicSingleton.getInstance();

        //show the message
        object.showMessage();
    }

}
