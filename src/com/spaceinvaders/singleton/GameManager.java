package com.spaceinvaders.singleton;

import com.spaceinvaders.model.Player;

public class GameManager {
    private static GameManager instance;
    private Player player;

    private GameManager() {}

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame(String playerName) {
        this.player = new Player(playerName);
        System.out.println("Juego iniciado por " + playerName);
    }

    public Player getPlayer() {
        return player;
    }
}
