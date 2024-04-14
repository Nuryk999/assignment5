package EX1;

public class Main {
    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();

        //  warrior
        creator.setFactory(new WarriorFactory());
        Character warrior = creator.createCharacter("Warrior1");
        System.out.println("Created Warrior: " + warrior);

        //  mage
        creator.setFactory(new MageFactory());
        Character mage = creator.createCharacter("Mage1");
        System.out.println("Created Mage: " + mage);

        // archer
        creator.setFactory(new ArcherFactory());
        Character archer = creator.createCharacter("Archer1");
        System.out.println("Created Archer: " + archer);
    }
}