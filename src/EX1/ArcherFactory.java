package EX1;

class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Character character = new Character(name);
        character.setAppearance(new Appearance("brown", "green", "green"));
        character.addAbility(new Ability("Arrow Shot"));
        character.addEquipment(new Equipment("Bow"));
        character.setAttributes(new Attributes(5, 5, 10));
        return character;
    }
}