package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/receiveSecret")
    public Secrets greeting(@RequestParam(value = "uid") String uid, @RequestParam(value = "secretUrl") String url) {
        System.out.println(uid + " " + url);

        return new Secrets(uid, url);
    }

    @RequestMapping("/uid")
    public UID greeting() {
        UID uid = new UID();
        System.out.println(uid.getuid());
        return uid;
    }
}
