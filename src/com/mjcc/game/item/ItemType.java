package com.mjcc.game.item;

public enum ItemType {

    BASIC_SHIELD(ItemPurpose.DEFENSE, "Basic Shield"),
    BASIC_AXE(ItemPurpose.WEAPON, "Basic Axe"),
    BREAD(ItemPurpose.HEALING, "Bread"),
    RUSTY_KNIFE(ItemPurpose.DEFAULT, "Rusty Knife"),
    STICK(ItemPurpose.DEFAULT, "Stick"),
    CLOTH(ItemPurpose.DEFAULT, "Cloth"),
    SMALL_ROCK(ItemPurpose.DEFAULT, "Small Rock"),
    TORCH(ItemPurpose.DEFAULT, "Torch"),
    LIGHTED_TORCH(ItemPurpose.DEFAULT, "Lighted Torch"),
    SCROLL(ItemPurpose.DEFAULT, "Scroll"),
    PILE_OF_LEAVES(ItemPurpose.DEFAULT, "Pile of Leaves");

    private ItemPurpose itemKind;
    private String displayName;

    ItemType(ItemPurpose itemKind, String displayName) {
        this.itemKind = itemKind;
        this.displayName = displayName;
    }


    //Getters and Setters
    public ItemPurpose getItemKind() {
        return itemKind;
    }

    public void setItemKind(ItemPurpose itemKind) {
        this.itemKind = itemKind;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
