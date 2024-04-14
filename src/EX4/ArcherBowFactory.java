package EX4;

public class ArcherBowFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Character("Archer", "Bow", new Weapon("Bow", 7, 6, 6), 90, 80);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Bow", 7, 6, 6);
    }
}

