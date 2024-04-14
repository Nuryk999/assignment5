package EX3;

public class IndustrialGlassFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Industrial Chair", "Industrial", "Glass", 120.0f);
    }

    @Override
    public Table createTable() {
        return new Table("Industrial Table", "Industrial", "Glass", 220.0f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Industrial Sofa", "Industrial", "Glass", 320.0f);
    }
}