package com.section1.Spring.framework;

import com.section1.Spring.framework.game.GameRunner;
import com.section1.Spring.framework.game.MarioGame;

public class AppGame {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}
