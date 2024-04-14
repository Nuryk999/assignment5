package EX4;

public class Main {
    public static void main(String[] args) {
        // Initialize the CharacterCreator
        CharacterCreator creator = new CharacterCreator();

        creator.setFactory(new WarriorSwordFactory());
        Character warrior = creator.createCharacter();

        creator.setFactory(new MageStaffFactory());
        Character mage = creator.createCharacter();

        creator.setFactory(new ArcherBowFactory());
        Character archer = creator.createCharacter();

        printCharacterDetails(warrior);
        printCharacterDetails(mage);
        printCharacterDetails(archer);
    }

    private static void printCharacterDetails(Character character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Class: " + character.getCharacterClass());
        System.out.println("Health: " + character.getHealth());
        System.out.println("Mana: " + character.getMana());
        System.out.println("Weapon: " + character.getWeapon().getType());
        System.out.println("Damage: " + character.getWeapon().getDamage());
        System.out.println("Speed: " + character.getWeapon().getSpeed());
        System.out.println("Range: " + character.getWeapon().getRange());
        System.out.println();
    }
}
