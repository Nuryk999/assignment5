package EX4;

public class MageStaffFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Character("Mage", "Staff", new Weapon("Staff", 5, 8, 4), 80, 100);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Staff", 5, 8, 4);
    }
}
