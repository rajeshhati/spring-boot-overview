package com.lob2code.demo.inititalizer.myapplicaton.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    @GetMapping("/hellow")
    public String test1(){
        return "rajesh hati";
    }
    @GetMapping("/hellow2")
    public String test2(){
        return "rajesh hati2";
    }

    @GetMapping("/hellow3")
    public String test3(){
        return "rajesh hati3";
    }

}
