package EX2;

public class DataProcessorCreator {
    private DataProcessor processor;

    public void setProcessor(DataProcessor processor) {
        this.processor = processor;
    }

    public void processData(Data data) {
        if (processor != null) {
            processor.process(data);
        } else {
            throw new IllegalStateException("Processor not set");
        }
    }
}