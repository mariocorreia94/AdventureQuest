package com.mjcc.game.character.enemy;

import com.mjcc.game.character.Character;

public class Enemy extends Character {

    private EnemyType enemyType;

    public Enemy () {
        super("Enemy",50,3,2);
    }

    public Enemy(EnemyType enemyType){
        super(enemyType.getName(), enemyType.getHealth(), enemyType.getBasicAttack(), enemyType.getBasicDeffense());
        this.enemyType = enemyType;
    }

}
