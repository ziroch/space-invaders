package com.spaceinvaders;

import com.spaceinvaders.factory.EnemyFactory;
import com.spaceinvaders.factory.EnemyType;
import com.spaceinvaders.model.Enemy;
import com.spaceinvaders.singleton.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager game = GameManager.getInstance();
        game.startGame("Victor");

        Enemy enemy1 = EnemyFactory.createEnemy(EnemyType.LASER_ENEMY);
        Enemy enemy2 = EnemyFactory.createEnemy(EnemyType.MISSILE_ENEMY);

        enemy1.attack();
        enemy2.attack();
    }
}
