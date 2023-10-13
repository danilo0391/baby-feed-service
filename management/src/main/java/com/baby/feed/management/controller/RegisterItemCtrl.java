package com.baby.feed.management.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RegisterItemCtrl {

    @RequestMapping("/items")
    public String[] getAllItems(){
        return new String[]{"Fraldinhas", "Coco", "Fralda", "Xixi"};
    }

    @RequestMapping("/items/id")
    public String[] getItemById(){
        return new String[]{"Fraldinha", "Coco"};
    }

}
