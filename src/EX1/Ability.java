package EX1;

public class Ability {
    private String name;

    public Ability(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "name='" + name + '\'' +
                '}';
    }
}
