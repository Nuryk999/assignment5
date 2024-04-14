package EX2;

public class VideoContent {
    private byte[] videoData;

    public VideoContent(byte[] videoData) {
        this.videoData = videoData;
    }

    public byte[] getVideoData() {
        return videoData;
    }

    public void setVideoData(byte[] videoData) {
        this.videoData = videoData;
    }
    @Override
    public String toString() {
        return "Video Content";
    }
}