package sample.web.rest;

import sample.web.vo.UserVO;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public UserVO index(@RequestParam(value="name", defaultValue="World") String name) {
        return new UserVO(counter.incrementAndGet(), String.format(template, name));
    }
}
