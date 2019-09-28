package top.anborong.rest;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String str) {
        this.id = id;
        content = str;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
