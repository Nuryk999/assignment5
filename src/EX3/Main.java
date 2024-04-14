package EX3;

public class Main {
    public static void main(String[] args) {
        FurnitureCreator creator = new FurnitureCreator();
        creator.setFactory(new ModernWoodFactory());

        Chair modernWoodChair = creator.createChair();
        Table modernWoodTable = creator.createTable();
        Sofa modernWoodSofa = creator.createSofa();

        System.out.println(modernWoodChair.getName() + " - $" + modernWoodChair.getPrice());
        System.out.println(modernWoodTable.getName() + " - $" + modernWoodTable.getPrice());
        System.out.println(modernWoodSofa.getName() + " - $" + modernWoodSofa.getPrice());
    }
}