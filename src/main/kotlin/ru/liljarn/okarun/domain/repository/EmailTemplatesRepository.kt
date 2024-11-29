package ru.liljarn.okarun.domain.repository

import org.springframework.data.repository.CrudRepository
import ru.liljarn.okarun.domain.model.dto.EmailTemplate
import ru.liljarn.okarun.domain.model.entity.EmailTemplateEntity
import ru.liljarn.okarun.domain.model.type.NotificationType

interface EmailTemplatesRepository : CrudRepository<EmailTemplateEntity, Long> {
    fun findTemplateByNotificationEvent(notificationEvent: NotificationType): EmailTemplate?
}
