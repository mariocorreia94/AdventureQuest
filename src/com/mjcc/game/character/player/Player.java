package com.mjcc.game.character.player;

import com.mjcc.game.character.Character;
import com.mjcc.game.item.Item;
import com.mjcc.game.item.ItemType;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class Player extends Character {

    private HashMap<Item, Boolean> inventory;
    Scanner userInput = new Scanner(System.in);

    public Player(String name) {
        super(name, 100, 30, 2);
        inventory = new HashMap<>();
    }

    public void addToInventory(Item item){
        inventory.put(item, false);
    }

    public void listInventory(){

    }

    public Item removeFromInventory(Item item) {

        if(inventory.get(item)){
            System.out.println("You can not remove an Item you are wearing");
            return item;
        }

        System.out.println("Are you sure you want to remove " + item.toString() + " from your Inventory?");

        if(userInput.nextLine().equals("y")) {
            inventory.remove(item);
            System.out.println("You removed an Item from your Inventory");
        }

        return null;

    }

    public Item equip(Item item){

        if(inventory.get(item)){
            System.out.println("You are already using this Item");
            return item;
        }

        //TODO: is item exists in inventory and if it is usable
        if(inventory.containsKey(item)) {
            inventory.put(item, true);
            System.out.println("Item " + item.toString() + "is equiped.");
            return item;
        } else {
            System.out.println("You can not wear an Item that is not in your Inventory");
            return null;
        }

    }

    public void unEquip(Item item){
        inventory.remove(item);
        System.out.println("You removed" + item.toString() + "from your inventory");
    }

}