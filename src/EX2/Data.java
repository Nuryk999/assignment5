package EX2;

public class Data {
    private String type;
    private Object content;

    public Data(String type, Object content) {
        this.type = type;
        this.content = content;
    }
    public String getType() {return this.type;}
    public Object getContent() {return this.content;}
    public void setType(String type) {
        this.type = type;
    }
    public void setContent(Object content) {
        this.content = content;
    }
}
