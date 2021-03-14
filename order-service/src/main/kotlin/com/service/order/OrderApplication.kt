package com.service.order

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

/**
 * Created by KMS on 2021/03/12.
 */
@SpringBootApplication
//@EnableFeignClients
class OrderApplication

fun main(args: Array<String>) {
    runApplication<OrderApplication>(*args)
}

@Component
class OrderApplicationRunner(
    private val orderRepository: OrderRepository
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        (1..10).map {
            orderRepository.save(Order(it.toLong()))
        }
    }


}