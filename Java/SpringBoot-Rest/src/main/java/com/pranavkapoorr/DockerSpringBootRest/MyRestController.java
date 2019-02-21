package com.pranavkapoorr.DockerSpringBootRest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {

    @RequestMapping("/")
    public String welcome() {
        return "hello I am dockerized!";
    }
}