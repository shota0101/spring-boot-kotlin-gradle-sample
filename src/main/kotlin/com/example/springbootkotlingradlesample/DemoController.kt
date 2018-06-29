package com.example.springbootkotlingradlesample

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

// http://localhost:8080/hello?param=test
@RestController
class DemoController {

    @RequestMapping("/hello")
    fun hello(
            @RequestParam(value = "param", required = false, defaultValue = "default") param: String
    ): ResponseEntity<Map<String, String>> {

        val data: Map<String, String> = mapOf(
                "message" to "Hello, Kotlin in Spring Boot",
                "param" to param,
                "date" to Date().toString())

        val responce: ResponseEntity<Map<String, String>>
                = ResponseEntity(data, HttpStatus.OK)
        return responce
    }
}