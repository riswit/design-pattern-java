package com.riswit.dpt.template;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){
        //initialize the game
        initialize();

        startPlay();

        endPlay();
    }

}
