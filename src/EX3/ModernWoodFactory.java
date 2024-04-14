package EX3;

public class ModernWoodFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Modern Chair", "Modern", "Wood", 100.0f);
    }

    @Override
    public Table createTable() {
        return new Table("Modern Table", "Modern", "Wood", 200.0f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Modern Sofa", "Modern", "Wood", 300.0f);
    }
}
