package com.mjcc.game.item;

public enum ItemPurpose {
    DEFAULT(""),
    HEALING("Heal"),
    WEAPON("Weapon"),
    SHIELD("Shield"),
    CHEST("Chest"),
    HELMET("Helmet"),
    BOOTS("Boots"),
    PANTS("Pants");

    private String purpose;

    ItemPurpose(String purpose) {
        this.purpose = purpose;
    }


    //Getters and Setters
    public String getPurpose() {
        return purpose;
    }
}