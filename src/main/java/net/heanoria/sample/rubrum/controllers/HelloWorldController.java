package net.heanoria.sample.rubrum.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public @ResponseBody String doGetHelloWorld() {
        return "Hello world !";
    }
}
