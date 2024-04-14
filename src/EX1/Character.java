package EX1;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private Appearance appearance;
    private final List<Ability> abilities;
    private final List<Equipment> equipment;
    private Attributes attributes;

    public Character(String name) {
        this.name = name;
        this.abilities = new ArrayList<>();
        this.equipment = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Appearance getAppearance() {
        return this.appearance;
    }
    public List<Ability> getAbilities() {
        return abilities;
    }
    public List<Equipment> getEquipment() {
        return this.equipment;
    }
    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public void addAbility(Ability ability) {
        this.abilities.add(ability);
    }

    public void addEquipment(Equipment equipment) {
        this.equipment.add(equipment);
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", appearance=" + appearance +
                ", abilities=" + abilities +
                ", equipment=" + equipment +
                ", attributes=" + attributes +
                '}';
    }
}