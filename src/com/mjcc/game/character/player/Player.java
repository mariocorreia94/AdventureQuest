package com.mjcc.game.character.player;

import com.mjcc.game.character.Character;
import com.mjcc.game.item.ItemPurpose;
import com.mjcc.game.item.Consumable;
import com.mjcc.game.item.Wearable;
import com.mjcc.game.item.Item;

import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Player extends Character {

    private Map<Item, Boolean> inventory;
    private ArmourSet armourSet;
    Scanner userInput = new Scanner(System.in);

    private static int inventoryLength = 20;

    public Player(String name) {
        super(name, 100, 30, 2);
        inventory = new HashMap<>();
        armourSet = ArmourSet.getArmourSet();
    }

    public void addToInventory(Item item){

        if(inventory.containsKey(item)) {
            System.out.println("You already have this Item in your Inventory.");
            return;
        }

        if(inventory.size() == inventoryLength) {
            System.out.println("You do not have space in your Inventory to add this Item.");
            return;
        }

        if(item.getItemPurpose() == ItemPurpose.DEFAULT){
            System.out.println("You can not add this type of item to your Inventory!");
            return;
        }
        inventory.put(item, false);
        System.out.println(item.getName() + " added to your inventory!");
    }

    public void listInventory(){

        Iterator it = inventory.entrySet().iterator();

        System.out.println("-------INVENTORY--------");
        while (it.hasNext()) {
            Map.Entry item = (Map.Entry)it.next();
            System.out.println(item.getKey() + (item.getValue().equals(true) ? " (Equipped)" : "" ));
        }
        System.out.println("------------------------");
    }

    public void listArmourSet() {
        armourSet.display();
    }

    public Item removeFromInventory(Item item) {

        if(!inventory.containsKey(item)){
            System.out.println("You do not have this Item in your Inventory");
            return item;
        }

        if(inventory.get(item).booleanValue()){
            System.out.println("You can not remove an Item that you are wearing!");
            return item;
        }

        System.out.println("Are you sure you want to remove " + item.getName() + " from your Inventory?");

        if(userInput.nextLine().equals("y")) {
            inventory.remove(item);
            System.out.println("You removed an Item from your Inventory");
            return null;
        }

        return item;

    }

    public Item equip(Item item){

        if(!inventory.containsKey(item)) {
            System.out.println("You can not equip an item that is not in your Inventory!");
            return null;
        }

        if((item.getItemPurpose() == ItemPurpose.DEFAULT)) {
            System.out.println("You can not wear this type of item");
            return item;
        }

        if(inventory.get(item)){
            System.out.println("You are already using this Item");
            return item;
        }

        if(inventory.containsKey(item)) {

            inventory.put(item, true);
            updateBasicAttack(((Wearable) item).getAttackBonus());
            updateBasicDefense(((Wearable) item).getDefenseBonus());
            armourSet.add(item.getItemPurpose().getPurpose(), item);
            System.out.println(item.getName() + " is equipped.");
        }
        return item;
    }

    public void unEquip(Item item){

        if(!inventory.containsKey(item)){
            System.out.println("You can not unEquip an Item you don't have in your Inventory");
            return;
        }

        if(!inventory.get(item).booleanValue()){
            System.out.println("This Item is already unEquipped");
            return;
        }

        updateBasicAttack(((Wearable) item).getAttackBonus() * - 1);
        updateBasicDefense(((Wearable) item).getDefenseBonus() * - 1);

        inventory.put(item, false);
        armourSet.remove(item.getItemPurpose().getPurpose());
        System.out.println("Unequipped " + item.getName() + ".");
    }

    public void useItem(Item item){

        if(!inventory.containsKey(item)) {
            System.out.println("You can not wear an Item that is not in your Inventory.");
            return;
        }

        if(item.getItemPurpose() != ItemPurpose.HEALING) {
            System.out.println("You can not use this Item in you!");
            return;
        }

        super.setHealth(super.getHealth() + ((Consumable) item).getBonus());
        System.out.println("Health Points increased to " + super.getHealth() + ".");
        inventory.remove(item);

    }

    public void sleep(){

        try {
            System.out.printf("Sleeping...");
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        super.setHealth(100);
        System.out.println("\r\nWhat a magnificence nap. My health is fully restored!");

    }

    private int updateBasicAttack(int upgrade) {
        super.setBasicAtack(super.getBasicAtack() + upgrade);

        return super.getBasicAtack();
    }

    private int updateBasicDefense(int upgrade) {
        super.setBasicDefense(super.getBasicDefense() + upgrade);

        return super.getBasicAtack();
    }
}