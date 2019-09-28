package top.anborong.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/a")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World!") String name,
            @RequestParam(value = "id") long id
    ) {
        return new Greeting(id, String.format(template, name));
    }
}
