package ru.liljarn.okarun.support.kafka

import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory
import org.springframework.kafka.config.TopicBuilder
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory
import org.springframework.kafka.core.KafkaAdmin

const val DEFAULT_CONSUMER_FACTORY = "DefaultConsumerFactory"

@Configuration
class KafkaConfiguration(
    private val properties: OkarunKafkaProperties,
) {

    private val defaultKafkaProperties = requireNotNull(properties.clusters["default"])

    @Bean
    fun kafkaAdmin(): KafkaAdmin {
        val adminProps = buildAdminProperties(defaultKafkaProperties)
        return KafkaAdmin(adminProps)
    }

    @Bean
    fun topic() = KafkaAdmin.NewTopics(
        TopicBuilder.name("okarun.notifications")
            .partitions(1)
            .build()
    )

    @Bean(DEFAULT_CONSUMER_FACTORY)
    fun defaultConsumerFactory() = ConcurrentKafkaListenerContainerFactory<String, Any>().apply {
        consumerFactory = jsonConsumerFactory(defaultKafkaProperties)
        setAutoStartup(properties.consumersEnabled)
    }

    private fun jsonConsumerFactory(clusterProperties: KafkaProperties): ConsumerFactory<String, Any> {
        val props = clusterProperties.buildConsumerProperties(null)
        return DefaultKafkaConsumerFactory(props)
    }

    private fun buildAdminProperties(clusterProperties: KafkaProperties): Map<String, Any> {
        val props = clusterProperties.buildAdminProperties(null)
        return props
    }
}
