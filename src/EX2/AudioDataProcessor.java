package EX2;

import java.util.Date;

public class AudioDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing audio data: " + data.getContent());
        String processedAudio = "Processed audio: " + data.getContent();
        storeInDatabase(processedAudio);
    }

    private void storeInDatabase(String processedData) {
        System.out.println("Storing processed audio data in database: " + processedData + " at " + new Date());
    }
}