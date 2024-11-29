package ru.liljarn.okarun.domain.service.notifications.handler

import AbstractNotificationPayloadCreator
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import ru.liljarn.okarun.domain.model.type.NotificationType
import ru.liljarn.okarun.domain.service.notifications.Event
import ru.liljarn.okarun.domain.service.templates.TemplatesService

@Component
class AdminMailingNotificationPayloadCreator(
    templateService: TemplatesService,
    @Value("\${spring.mail.username}")
    sender: String
) : AbstractNotificationPayloadCreator<AdminMailingNotificationEvent>(templateService, sender) {

    override val notificationType = NotificationType.ADMIN_MAILING

    override val eventClass = AdminMailingNotificationEvent::class

    override fun replaceData(email: String, event: AdminMailingNotificationEvent) =
        email.replace("{{title}}", event.title)
            .replace("{{payload}}", event.payload)
}

data class AdminMailingNotificationEvent(
    override val email: String,
    override val eventType: NotificationType,
    val payload: String,
    val title: String
) : Event
