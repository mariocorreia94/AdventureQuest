package com.mjcc.game.character.player;

import com.mjcc.game.item.Item;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArmourSet {

    private static ArmourSet single_armourSet = null;

    private Map<String, Item> armourSet;

    private ArmourSet() {
        armourSet = new HashMap<>();
        initialize();
    }

    public static ArmourSet getArmourSet()
    {
        if (single_armourSet == null) {
            single_armourSet = new ArmourSet();
        }

        return single_armourSet;
    }

    private void initialize(){
        armourSet.put("Helmet", null);
        armourSet.put("Chest", null);
        armourSet.put("Pants", null);
        armourSet.put("Boots", null);
        armourSet.put("Weapon", null);
        armourSet.put("Shield", null);
    }

    public void display() {

        Iterator it = armourSet.entrySet().iterator();

        System.out.println("-------ARMOUR SET--------");
        while (it.hasNext()) {
            Map.Entry item = (Map.Entry)it.next();
            System.out.println(item.getKey() + (item.getValue() == null ? " (Nothing Equipped)" :  " " + item.getValue().toString() ));
        }
        System.out.println("-------------------------");
    }

    public void add(String key, Item item){

        if(!armourSet.containsKey(key)){
            return;
        }
        armourSet.put(key, item);

    }

    public void remove(String key) {
        if(!armourSet.containsKey(key)){
            return;
        }
        armourSet.put(key, null);
    }
}
