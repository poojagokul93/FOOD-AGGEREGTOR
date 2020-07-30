package com.aggregator.foodaggregator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoodaggregatorApplication

fun main(args: Array<String>) {
    runApplication<FoodaggregatorApplication>(*args)
}
