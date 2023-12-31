package com.diamorph.learnspringframework.game;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;
    public GameRunner(@Qualifier("superContraGameQualifier") GamingConsole game) {
        this.game = game;
    }

    public GamingConsole getGame() {
        return game;
    }

    public void setGame(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
