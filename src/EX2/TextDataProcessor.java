package EX2;

import java.util.Date;

public class TextDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing text data: " + data.getContent());
        String processedText = "Processed text: " + data.getContent();
        storeInDatabase(processedText);
    }

    private void storeInDatabase(String processedData) {
        System.out.println("Storing processed text data in database: " + processedData + " at " + new Date());
    }
}