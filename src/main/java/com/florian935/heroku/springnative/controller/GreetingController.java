package com.florian935.heroku.springnative.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

    @GetMapping("greeting")
    Mono<String> greeting() {
        return Mono.just("Hello World !");
    }
}
