package EX3;

public class TraditionalMetalFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Traditional Chair", "Traditional", "Metal", 150.0f);
    }

    @Override
    public Table createTable() {
        return new Table("Traditional Table", "Traditional", "Metal", 250.0f);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Traditional Sofa", "Traditional", "Metal", 350.0f);
    }
}

