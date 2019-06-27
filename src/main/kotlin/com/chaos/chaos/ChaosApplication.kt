package com.chaos.chaos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChaosApplication

fun main(args: Array<String>) {
	runApplication<ChaosApplication>(*args)
}
