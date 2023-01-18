package com.roux.rouxapi

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@EnableAutoConfiguration
class RouxApiApplication

fun main(args: Array<String>) {
	runApplication<RouxApiApplication>(*args)
}
