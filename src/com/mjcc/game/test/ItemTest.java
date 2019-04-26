package com.mjcc.game.test;

import com.mjcc.game.item.Consumable;
import com.mjcc.game.item.Generable;
import com.mjcc.game.item.ItemPurpose;
import com.mjcc.game.item.Wearable;

public class ItemTest {

    public static void main(String[] args) {

        Consumable heal = new Consumable("Healing Potion", 6);

        System.out.println(heal.toString());
        System.out.println(heal.getName());


        Wearable axe = new Wearable("Basic Axe", ItemPurpose.WEAPON, 10, 0);

        System.out.println(axe.toString());
        axe.setName("Axe Changed Name");
        System.out.println(axe.toString());


        Wearable shield = new Wearable("Basic Shield", ItemPurpose.SHIELD, 0, 10);

        System.out.println(shield.toString());
        shield.setName("Shield Changed Name");
        System.out.println(shield.toString());


        Generable general = new Generable("Pile of Leaves");

        System.out.println(general.toString());
        general.setName("General Changed Name");
        System.out.println(general.toString());


        /*
        BASIC_SHIELD("Basic Shield", ItemPurpose.SHIELD),
        BASIC_AXE("Basic Axe", ItemPurpose.WEAPON),
        BREAD("Bread", ItemPurpose.HEALING),
        RUSTY_KNIFE("Rusty Knife", ItemPurpose.DEFAULT),
        STICK("Stick", ItemPurpose.DEFAULT),
        CLOTH("Cloth", ItemPurpose.DEFAULT),
        SMALL_ROCK("Small Rock", ItemPurpose.DEFAULT),
        TORCH("Torch", ItemPurpose.DEFAULT),
        LIGHTED_TORCH("Lighted Torch", ItemPurpose.DEFAULT),
        SCROLL("Scroll", ItemPurpose.DEFAULT),
        PILE_OF_LEAVES("Pile of Leaves", ItemPurpose.DEFAULT);
         */
    }
}
