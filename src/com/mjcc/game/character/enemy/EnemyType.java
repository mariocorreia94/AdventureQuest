package com.mjcc.game.character.enemy;

public enum EnemyType {

    MONSTER("MONSTER", 50, 3, 2),
    DRAGON("DRAGON", 100, 5, 4),
    DWARF("DWARF", 60, 5, 4),
    ELF("ELF", 80, 2, 1),
    MERCENARY("MERCENARY", 150, 10, 8),
    TROLL("TROLL", 500, 15, 14);


    private String name;
    private int health;
    private int basicAttack;
    private int basicDeffense;

    EnemyType(String name, int health, int basicAttack, int basicDeffense) {
        this.name = name;
        this.health = health;
        this.basicAttack = basicAttack;
        this.basicDeffense = basicDeffense;

    }

    public String getName() {
        return name;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public int getBasicDeffense() {
        return basicDeffense;
    }

    public int getHealth() {
        return health;
    }
}
