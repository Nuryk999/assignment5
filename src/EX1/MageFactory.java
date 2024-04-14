package EX1;

public class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Character character = new Character(name);
        character.setAppearance(new Appearance("yellow", "black", "red"));
        character.addAbility(new Ability("Fireball"));
        character.addEquipment(new Equipment("Staff"));
        character.setAttributes(new Attributes(5, 10, 5));
        return character;
    }
}