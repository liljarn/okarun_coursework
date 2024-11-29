package ru.liljarn.okarun

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka
import ru.liljarn.okarun.support.kafka.OkarunKafkaProperties

@EnableKafka
@EnableConfigurationProperties(OkarunKafkaProperties::class)
@SpringBootApplication
class OkarunApplication

fun main(args: Array<String>) {
	runApplication<OkarunApplication>(*args)
}
