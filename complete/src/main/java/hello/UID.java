package hello;

import java.util.UUID;

public class UID {

    private String uid;

    public void setuid(String uid) {
        this.uid = uid;
    }

    UID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        uid = str.replace("-", "");
    }

    public String getuid() {
        return uid;
    }

}
