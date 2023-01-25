package com.roux.rouxapi

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class RouxApiApplication

fun main(args: Array<String>) {
	runApplication<RouxApiApplication>(*args)
}
