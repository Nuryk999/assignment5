package EX2;

public class AudioContent {
    private byte[] audioData;

    public AudioContent(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public void setAudioData(byte[] audioData) {
        this.audioData = audioData;
    }
    @Override
    public String toString() {
        return "Audio content";
    }
}
