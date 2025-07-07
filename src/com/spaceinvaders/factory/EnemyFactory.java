package com.spaceinvaders.factory;

import com.spaceinvaders.model.Enemy;
import com.spaceinvaders.strategy.LaserAttack;
import com.spaceinvaders.strategy.MissileAttack;

public class EnemyFactory {
    public static Enemy createEnemy(EnemyType type) {
        switch (type) {
            case LASER_ENEMY:
                return new Enemy("Alien Laser", new LaserAttack());
            case MISSILE_ENEMY:
                return new Enemy("Alien Missile", new MissileAttack());
            default:
                throw new IllegalArgumentException("Tipo de enemigo desconocido");
        }
    }
}
