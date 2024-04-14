package EX1;

public class CharacterCreator {
    private CharacterFactory factory;

    public void setFactory(CharacterFactory factory) {
        this.factory = factory;
    }

    public Character createCharacter(String name) {
        if (factory != null) {
            return factory.createCharacter(name);
        } else {
            throw new IllegalStateException("Factory not set");
        }
    }
}