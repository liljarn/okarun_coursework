package ru.liljarn.okarun.domain.service.notifications.handler

import AbstractNotificationPayloadCreator
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import ru.liljarn.okarun.domain.model.type.NotificationType
import ru.liljarn.okarun.domain.service.notifications.Event
import ru.liljarn.okarun.domain.service.templates.TemplatesService
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Component
class NewReservationNotificationPayloadCreator(
    templateService: TemplatesService,
    @Value("\${spring.mail.username}")
    sender: String
) : AbstractNotificationPayloadCreator<NewReservationNotificationEvent>(templateService, sender) {

    override val notificationType = NotificationType.NEW_RESERVATION

    override val eventClass = NewReservationNotificationEvent::class

    override fun replaceData(email: String, event: NewReservationNotificationEvent) =
        email.replace("{{firstName}}", event.firstName)
            .replace("{{bookName}}", event.bookName)
            .replace("{{authorName}}", event.authorName)
            .replace("{{dueDate}}", event.dueDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")))
}

data class NewReservationNotificationEvent(
    override val email: String,
    override val eventType: NotificationType,
    val firstName: String,
    val bookName: String,
    val authorName: String,
    val dueDate: LocalDate
) : Event
