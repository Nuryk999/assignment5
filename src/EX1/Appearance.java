package EX1;

public class Appearance {
    private String hairColor;
    private String eyeColor;
    private String armorColor;

    public Appearance(String hairColor, String eyeColor, String armorColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.armorColor = armorColor;
    }

    // Getters and setters
    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getArmorColor() {
        return armorColor;
    }

    public void setArmorColor(String armorColor) {
        this.armorColor = armorColor;
    }

    @Override
    public String toString() {
        return "Appearance{" +
                "hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", armorColor='" + armorColor + '\'' +
                '}';
    }
}
