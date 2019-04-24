package com.mjcc.game.character.player;

import com.mjcc.game.character.Character;
import com.mjcc.game.item.Item;
import com.mjcc.game.item.ItemPurpose;
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
        System.out.println(item.toString() + " added to your inventory!");
    }

    public void listInventory(){
        System.out.println("-------INVENTORY--------");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.keySet().toArray()[i].toString());
        }
        System.out.println("------------------------");
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

        if(!inventory.containsKey(item)) {
            System.out.println("You can not equip an item that is not in your Inventory!");
            return null;
        }

        if((item.getType().getItemKind() == ItemPurpose.DEFAULT)) {
            System.out.println("You can not wear this type of item");
            return item;
        }

        if(inventory.get(item)){
            System.out.println("You are already using this Item");
            return item;
        }

        if(inventory.containsKey(item)) {
            inventory.put(item, true);
            System.out.println(item.toString() + " is equiped.");
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