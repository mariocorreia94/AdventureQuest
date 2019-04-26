package com.mjcc.game.test;

import com.mjcc.game.character.enemy.Enemy;
import com.mjcc.game.character.enemy.EnemyType;
import com.mjcc.game.character.player.Player;
import com.mjcc.game.item.Consumable;
import com.mjcc.game.item.Generable;
import com.mjcc.game.item.ItemPurpose;
import com.mjcc.game.item.Wearable;

public class PlayerTest {

    public static void main(String[] args) {

        Player player = new Player("Mário");
        Consumable heal = new Consumable("Healing Potion", 6);
        Generable general = new Generable("Pile of Leaves");
        Wearable axe = new Wearable("Basic Axe", ItemPurpose.WEAPON, 10, 0);
        Wearable shield = new Wearable("Basic Shield", ItemPurpose.SHIELD, 0, 10);
        Wearable helmet = new Wearable("Basic Helmet", ItemPurpose.HELMET, 0, 10);
        Wearable chest = new Wearable("Basic Chest", ItemPurpose.CHEST, 0, 10);
        Wearable boots = new Wearable("Basic Boots", ItemPurpose.BOOTS, 0, 10);
        Wearable pants = new Wearable("Basic pants", ItemPurpose.PANTS, 0, 10);

        player.addToInventory(heal);
        player.addToInventory(axe);
        player.addToInventory(shield);
        player.addToInventory(general);


        player.listInventory();

        //player.removeFromInventory(heal);
        player.removeFromInventory(general);

        player.listInventory();

        System.out.println(player.getBasicAtack());
        player.equip(axe);
        System.out.println(player.getBasicAtack());
        player.listInventory();
        player.unEquip(axe);
        System.out.println(player.getBasicAtack());

        //player.setHealth(20);
        player.useItem(heal);

        player.listInventory();

        player.listArmourSet();
        player.equip(axe);
        player.equip(shield);
        player.listArmourSet();

        player.addToInventory(chest);
        player.equip(chest);
        player.addToInventory(helmet);
        player.equip(helmet);
        player.addToInventory(boots);
        player.equip(boots);
        player.addToInventory(pants);
        player.equip(pants);

        player.listArmourSet();

        System.out.println(player.getBasicAtack());
        System.out.println(player.getBasicDefense());

        player.sleep();

        player.unEquip(axe);
        player.unEquip(shield);

        System.out.println(player.getBasicAtack());
        System.out.println(player.getBasicDefense());

        player.unEquip(chest);
        player.unEquip(helmet);
        player.unEquip(boots);
        player.unEquip(pants);

        player.unEquip(pants);

        player.listArmourSet();

        System.out.println(player.getBasicAtack());
        System.out.println(player.getBasicDefense());
    }
}
