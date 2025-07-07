package com.spaceinvaders.model;

import com.spaceinvaders.strategy.AttackStrategy;

public class Enemy {
    private String name;
    private AttackStrategy attackStrategy;

    public Enemy(String name, AttackStrategy strategy) {
        this.name = name;
        this.attackStrategy = strategy;
    }

    public void attack() {
        System.out.print(name + ": ");
        attackStrategy.attack();
    }

    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }
}
