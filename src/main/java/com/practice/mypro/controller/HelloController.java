package com.practice.mypro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.mypro.service.HelloService;

@RestController
public class HelloController {
	@Autowired
    HelloService helloServic;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return helloServic.sayHiFromClientOne(name);
    }
}
