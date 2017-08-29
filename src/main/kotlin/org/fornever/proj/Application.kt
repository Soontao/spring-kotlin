package org.fornever.proj

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class Application {

    @GetMapping("/")
    fun hello(): String {
        return "hello world !"
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
