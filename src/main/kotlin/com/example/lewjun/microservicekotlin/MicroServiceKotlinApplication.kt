package com.example.lewjun.microservicekotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class MicroServiceKotlinApplication

fun main(args: Array<String>) {
    val ctx = runApplication<MicroServiceKotlinApplication>(*args)

    println("Let's inspect the beans provided by Spring Boot:")

    val beanNames = ctx.beanDefinitionNames
    Arrays.sort(beanNames)
    for (beanName in beanNames) {
        println(beanName)
    }
}
