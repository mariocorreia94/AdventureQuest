package com.mjcc.game.item;

public class Item {

    private ItemType type;

    public Item(ItemType type) {

        this.type = type;

    }


    public ItemType getType() {
        return type;
    }


    @Override
    public String toString() {
        return type.getDisplayName();
    }
}
