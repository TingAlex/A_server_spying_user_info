package hello;

public class Secrets {

    private final String uid;
    private final String url;

    public Secrets(String uid, String url) {
        this.uid = uid;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getUid() {
        return uid;
    }
}
