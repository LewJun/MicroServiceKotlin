package com.example.lewjun.microservicekotlin

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @RequestMapping("/")
    fun index() = "Greetings from Spring Boot!"

    // 如果Jackson 2位于类路径中，那么Spring的MappingJackson2HttpMessageConvert会把Person转换成为JSON
    @RequestMapping("/login", method = [RequestMethod.POST])
    fun login(@RequestParam("username") username: String
              , @RequestParam("password") password: String) = Person(username, password)
}