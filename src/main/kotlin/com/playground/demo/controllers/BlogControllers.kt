package com.playground.demo.controllers

import com.playground.demo.models.Blog
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BlogControllers {

    @GetMapping("/")
    fun blog(): ResponseEntity<Blog> {
        val blog =  Blog(10, "T", "Hello world");

        return ResponseEntity.ok(blog);
    }

}