package com.mjcc.game.item;

public class Generable extends Item {

    public Generable(String name) {
        super(name, ItemPurpose.DEFAULT);
    }


    @Override
    public void setName(String name) {
        System.out.println("You can not change this Item name!");
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
