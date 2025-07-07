package com.spaceinvaders.strategy;

public class MissileAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Lanzando misil...");
    }
}
