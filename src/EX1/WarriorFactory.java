package EX1;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Character character = new Character(name);
        character.setAppearance(new Appearance("black", "yellow", "blue"));
        character.addAbility(new Ability("Slash"));
        character.addEquipment(new Equipment("Sword"));
        character.setAttributes(new Attributes(10, 5, 5));
        return character;
    }
}