package EX2;

import java.util.Date;

public class VideoDataProcessor extends DataProcessor {
    @Override
    public void process(Data data) {
        System.out.println("Processing video data: " + data.getContent());
        String processedVideo = "Processed video: " + data.getContent();
        storeInDatabase(processedVideo);
    }

    private void storeInDatabase(String processedData) {
        System.out.println("Storing processed video data in database: " + processedData + " at " + new Date());
    }
}
