package com.mjcc.game.test;

import com.mjcc.game.item.Item;
import com.mjcc.game.item.ItemType;

public class ItemTest {

    public static void main(String[] args) {

        Item item = new Item(ItemType.BASIC_AXE);

        System.out.println(item.getType().getItemKind());

    }
}
