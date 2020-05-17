package io.pritikant.controller;

import io.pritikant.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/lll")
    public Greeting message(){
        return new Greeting("Hellow");
    }



}
