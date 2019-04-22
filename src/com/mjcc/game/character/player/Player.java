package com.mjcc.game.character.player;

import com.mjcc.game.character.Character;
import com.mjcc.game.item.Item;

import java.util.HashMap;

public class Player extends Character {

    private HashMap<Item, Boolean> inventory;

    public Player(String name) {
        super(name, 100, 30, 2);
        inventory = new HashMap<>();
    }

    public void addToInventory(Item item){
        inventory.put(item, false);
    }

    public void listInventory(){

    }

    public void equip(){

    }

    public void unEquip(){

    }

    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }

}