package com.example.flexbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "example1";
    }

    @RequestMapping("/items")
    public String flexItems() {
        return "items";
    }

    @RequestMapping("/containers")
    public String flexContainers() {
        return "containers";
    }
}
