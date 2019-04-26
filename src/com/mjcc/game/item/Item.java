package com.mjcc.game.item;

public class Item {

    private String name;
    private String generalName;
    private ItemPurpose itemPurpose;

    Item(String name, ItemPurpose itemPurpose) {
        this.name = name;
        this.generalName = name;
        this.itemPurpose = itemPurpose;
    }

    //Getters and Setters
    public String getName() {
        if(name.equals(generalName)) {
            return generalName;
        }
        return generalName + " (" + name + ")";
    }

    public ItemPurpose getItemPurpose() {
        return itemPurpose;
    }

    public void setName(String name) {
        this.name = name;
    }
}
