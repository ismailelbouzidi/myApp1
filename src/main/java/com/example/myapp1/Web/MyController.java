package com.example.myapp1.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/getMessageF")
    public String getMessageF(){
        return "Bonjour Spring boot";
    }

    @GetMapping("/getMessageE")
    public String getMessageE(){
        return "Hello Spring boot";
    }


}
