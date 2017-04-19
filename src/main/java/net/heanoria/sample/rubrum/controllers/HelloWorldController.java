package net.heanoria.sample.rubrum.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping(value = "/hello-world")
    public @ResponseBody String doGetHelloWorld() {
        return "Hello world !";
    }

    @GetMapping(value = "/hello/{name}")
    public @ResponseBody String doGetHelloSomeone(@PathVariable String name) {
        return "Hello " + name + " !";
    }
}
