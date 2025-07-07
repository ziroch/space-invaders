package com.spaceinvaders.model;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void shoot() {
        System.out.println(name + " dispara un rayo!");
    }
}
