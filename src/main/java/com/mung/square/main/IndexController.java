package com.mung.square.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "layout/indexLayout";
    }

    @GetMapping("/about")
    public String about() {
        return "include/aboutContent";
    }
}
