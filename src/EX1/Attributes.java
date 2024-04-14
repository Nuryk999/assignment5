package EX1;

public class Attributes {
    private int strength;
    private int intelligence;
    private int agility;

    public Attributes(int strength, int intelligence, int agility) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "strength=" + strength +
                ", intelligence=" + intelligence +
                ", agility=" + agility +
                '}';
    }
}
