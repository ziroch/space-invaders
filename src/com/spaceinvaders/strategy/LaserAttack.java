package com.spaceinvaders.strategy;

public class LaserAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Disparando con láser...");
    }
}
