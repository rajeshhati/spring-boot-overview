package com.lob2code.demo.inititalizer.myapplicaton.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController2 {

    @GetMapping("/hellow")
    public String test1(){
        return "rajesh hati";
    }


}
