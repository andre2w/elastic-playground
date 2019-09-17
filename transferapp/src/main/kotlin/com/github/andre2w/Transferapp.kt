package com.github.andre2w

import org.intellij.lang.annotations.Language
import java.time.LocalDateTime.*
import java.time.format.DateTimeFormatter
import kotlin.random.Random

fun main(args: Array<String>) {
    while (true) {
        val date = now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)


        println("$date [INFO] com.github.andre2w.Transferapp - ${createBody(date, randomAmount())}")
        Thread.sleep(1000)
    }
}

private fun randomAmount(): String {
    val amount = Random.nextInt(50, 1000)
    val pence = Random.nextInt(10, 99)
    return "$amount.$pence"
}

@Language("JSON")
fun createBody(date: String, amount: String) = """{ "paymentDate": "$date", "amount": $amount, "message": "Payment message", "origin": { "sortCode": "11-11-11", "account": "838383" }, "destination": { "sortCode": "11-11-11", "account": "1313123" } }""".trimIndent()