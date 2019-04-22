package com.mjcc.game.character;


import java.util.Random;

public class Character {

    private String name;
    private int health;
    private int basicAtack;
    private int basicDefense;


    public Character(String name, int health, int basicAtack, int basicDefense) {
        this.name = name;
        this.health = health;
        this.basicAtack = basicAtack;
        this.basicDefense = basicDefense;
    }

    public int attack(Character character){
        int damage;
        Random r = new Random();
        damage = r.nextInt((getBasicAtack()) + 1) - character.getBasicDefense();

        if(damage < 0){
            damage = 0;
            System.out.println("No damage is going to be taken");
        }

        character.setHealth(character.getHealth() - (damage));

        return character.getHealth();
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    private int getBasicAtack() {
        return basicAtack;
    }

    public void setBasicAtack(int basicAtack) {
        this.basicAtack = basicAtack;
    }

    private int getBasicDefense() {
        return basicDefense;
    }

    public void setBasicDefense(int basicDefense) {
        this.basicDefense = basicDefense;
    }

    public boolean isDead() {
        return health <= 0;
    }
}
