package EX2;

public class Main {
    public static void main(String[] args) {
        DataProcessorCreator creator = new DataProcessorCreator();

        // for text data
        creator.setProcessor(new TextDataProcessor());
        creator.processData(new Data("text", new TextContent("Hello World")));

        // for audio data
        creator.setProcessor(new AudioDataProcessor());
        creator.processData(new Data("audio", new AudioContent(new byte[]{1, 2, 3})));

        // for video data
        creator.setProcessor(new VideoDataProcessor());
        creator.processData(new Data("video", new VideoContent(new byte[]{4, 5, 6})));
    }
}