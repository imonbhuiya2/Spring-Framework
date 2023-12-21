package com.section1.Spring.framework.game;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame game) {
        this.game = game;

    }

    public void run() {
        System.out.println("Running Game:" + game);
        game.down();
        game.up();
        game.right();
        game.left();
    }
}
