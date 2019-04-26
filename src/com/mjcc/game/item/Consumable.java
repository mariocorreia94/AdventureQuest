package com.mjcc.game.item;

public class Consumable extends Item {

    private int bonus;

    public Consumable(String name, int bonus) {
        super(name, ItemPurpose.HEALING);
        this.bonus = bonus;
    }

    @Override
    public void setName(String name) {
        System.out.println("You can not change this Item name!");
    }

    //Getters and Setters
    public int getBonus() {
        return bonus;
    }


    @Override
    public String toString() {
        return super.getName() + " Bonus: " + bonus;
    }
}
