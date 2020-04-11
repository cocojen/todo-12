package dev.codesquad.java.todo12.jwt;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jwtController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
