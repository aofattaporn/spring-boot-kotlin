package com.playground.demo.controllers

import com.playground.demo.models.Blog
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BlogControllers {

    @GetMapping("/")
    fun getAllPost(): ResponseEntity<Blog> {
        val blog =  Blog(10, "T", "Hello world");

        return ResponseEntity.ok(blog);
    }

    @PostMapping("/")
    fun createPost(@RequestBody requestBody: Blog  ): ResponseEntity<Blog> {
        val blog =  Blog(requestBody.age, requestBody.name, requestBody.email);

        return ResponseEntity.ok(blog);
    }

}