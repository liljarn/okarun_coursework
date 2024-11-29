package ru.liljarn.okarun.domain.service.templates

import org.springframework.stereotype.Service
import ru.liljarn.okarun.domain.model.type.NotificationType
import ru.liljarn.okarun.domain.repository.EmailTemplatesRepository

@Service
class TemplatesService(
    private val templatesRepository: EmailTemplatesRepository,
) {

    fun findTemplate(event: NotificationType) = templatesRepository.findTemplateByNotificationEvent(event) ?: throw RuntimeException("Template not found")
}
