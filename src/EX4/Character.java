package EX4;

public class Character {
    private String name;
    private String characterClass;
    private Weapon weapon;
    private int health;
    private int mana;

    public Character(String name, String characterClass, Weapon weapon, int health, int mana) {
        this.name = name;
        this.characterClass = characterClass;
        this.weapon = weapon;
        this.health = health;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
