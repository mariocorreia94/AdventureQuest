package com.mjcc.game;

import com.mjcc.game.character.enemy.EnemyType;
import com.mjcc.game.character.player.Player;
import com.mjcc.game.character.enemy.Enemy;
import com.mjcc.game.item.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Player p1 = new Player("Mário");
        Enemy e1 = new Enemy(EnemyType.MERCENARY);

        Item item = new Wearable("Basic Shield", ItemPurpose.SHIELD, 0, 10);
        Item item1 = new Generable("Pile of leaves");
        Item item2 = new Wearable("Basic Axe", ItemPurpose.WEAPON, 10, 0);

        p1.addToInventory(item);
        p1.addToInventory(item1);
        p1.addToInventory(item2);

        p1.equip(item2);

        p1.listInventory();

        p1.setHealth(20);

        System.out.println(p1.getHealth());

        p1.sleep();

        System.out.println(p1.getHealth());

        //p1.removeFromInventory(item1);
/*
        while (!e1.isDead() && !p1.isDead()) {

            p1.attack(e1);
            System.out.println("enemy has " + e1.getHealth() + " HP");

            e1.attack(p1);
            System.out.println(p1.getName() + " has " + p1.getHealth() + " HP");

        }

        if(e1.isDead()) {
            System.out.println(e1.getName() + " is dead");
        } else {
            System.out.println(p1.getName() + " is dead");
        }*/
    }
}
