package com.FET.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
    @GetMapping("/")
    public String home123(){
        //Thymeleaf template filename
        return "home";
    }
}
