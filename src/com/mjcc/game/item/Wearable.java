package com.mjcc.game.item;

public class Wearable extends Item {

    private int attackBonus;
    private int defenseBonus;

    public Wearable(String name, ItemPurpose purpose, int attackBonus, int defenseBonus){
        super(name, purpose);
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
    }


    //Getters and Setters
    public int getAttackBonus() {
        return attackBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    @Override
    public String toString() {
        return super.getName() + " Attack Bonus: " + attackBonus + " Defense Bonus " + defenseBonus;
    }
}
