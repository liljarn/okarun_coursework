package ru.liljarn.okarun.domain.service.notifications

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service
import ru.liljarn.okarun.domain.model.type.NotificationType
import ru.liljarn.okarun.domain.service.notifications.handler.NotificationCreator
import ru.liljarn.okarun.support.dsl.sendEmail
import ru.liljarn.okarun.support.json.JsonUtils

private val logger = KotlinLogging.logger { }

@Service
class NotificationService(
    private val mailSender: JavaMailSender,
    handlers: List<NotificationCreator<out Event>>
) {

    private val handlersMap = handlers.associateBy { it.notificationType }

    fun sendNotification(payload: String) {
        val event = JsonUtils.fromJson(payload, NotificationEvent::class)

        logger.info { "Start sending notification event to ${event.email}, eventType=${event.eventType}" }

        handlersMap[event.eventType]?.createNotification(payload)?.let {
            mailSender.sendEmail(it)
        }
    }
}

interface Event {
    val email: String
    val eventType: NotificationType
}

data class NotificationEvent(
    override val email: String,
    override val eventType: NotificationType
) : Event
