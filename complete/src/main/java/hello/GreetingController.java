package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/receiveSecret")
    public Secrets greeting(@RequestParam(value = "secretUrl") String url) {
        System.out.println(url);
        return new Secrets(url);
    }
}
