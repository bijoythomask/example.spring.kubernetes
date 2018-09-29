package example.spring.kubernetes.frontend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/user")
    public String getUser(){
        return "Bijoy Thomas";
    }

}
