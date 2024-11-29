package ru.liljarn.okarun.domain.service.notifications.handler

import AbstractNotificationPayloadCreator
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import ru.liljarn.okarun.domain.model.type.NotificationType
import ru.liljarn.okarun.domain.service.notifications.Event
import ru.liljarn.okarun.domain.service.templates.TemplatesService

@Component
class OverdueRentNotificationPayloadCreator(
    templateService: TemplatesService,
    @Value("\${spring.mail.username}")
    sender: String
) : AbstractNotificationPayloadCreator<OverdueRentNotificationEvent>(templateService, sender) {

    override val notificationType = NotificationType.OVERDUE_RENT

    override val eventClass = OverdueRentNotificationEvent::class

    override fun replaceData(email: String, event: OverdueRentNotificationEvent) =
        email.replace("{{firstName}}", event.firstName)
            .replace("{{bookName}}", event.bookName)
            .replace("{{authorName}}", event.authorName)
}

data class OverdueRentNotificationEvent(
    override val email: String,
    override val eventType: NotificationType,
    val firstName: String,
    val bookName: String,
    val authorName: String,
) : Event
