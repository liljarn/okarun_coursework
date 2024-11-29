package ru.liljarn.okarun.domain.model.dto

import ru.liljarn.okarun.domain.model.type.NotificationType

data class EmailTemplate(
    val notificationEvent: NotificationType,
    val subject: String,
    val htmlTemplate: String,
)
