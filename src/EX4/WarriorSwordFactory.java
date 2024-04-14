package EX4;

public class WarriorSwordFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Character("Warrior", "Sword", new Weapon("Sword", 10, 5, 2), 100, 50);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Sword", 10, 5, 2);
    }
}