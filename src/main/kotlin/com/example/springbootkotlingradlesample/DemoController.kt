package com.example.springbootkotlingradlesample

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class DemoController {

    @RequestMapping("/hello")
    fun hello(): ResponseEntity<Map<String, String>> {
        val data: Map<String, String> = mapOf(
                "message" to "Hello, Kotlin in Spring Boot",
                "date" to Date().toString())

        val responce: ResponseEntity<Map<String, String>>
                = ResponseEntity(data, HttpStatus.OK)
        return responce
    }
}