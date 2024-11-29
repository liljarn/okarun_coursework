package ru.liljarn.okarun.listener

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.messaging.Message
import org.springframework.stereotype.Component
import ru.liljarn.okarun.domain.service.notifications.NotificationService
import ru.liljarn.okarun.support.kafka.DEFAULT_CONSUMER_FACTORY

private val logger = KotlinLogging.logger { }

@Component
class NotificationsEventListener(
    private val notificationService: NotificationService
) {

    @KafkaListener(
        topics = ["\${kafka.topics.notification.destination}"],
        containerFactory = DEFAULT_CONSUMER_FACTORY,
        groupId = "\${kafka.topics.notification.groupId}",
    )
    fun listen(message: Message<String>) {
        logger.info { "Received notification event: ${message.payload} "}

        notificationService.sendNotification(message.payload)
    }
}
