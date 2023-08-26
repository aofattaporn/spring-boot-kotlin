package com.playground.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Blog {

    @GetMapping("/")
    fun blog(): String{
        return  "hello response";
    }

}