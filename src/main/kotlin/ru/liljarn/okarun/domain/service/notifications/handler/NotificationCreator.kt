package ru.liljarn.okarun.domain.service.notifications.handler

import ru.liljarn.okarun.domain.model.type.NotificationType
import ru.liljarn.okarun.domain.service.notifications.Event
import ru.liljarn.okarun.support.dsl.EmailMessage
import kotlin.reflect.KClass

interface NotificationCreator<T : Event> {

    val notificationType: NotificationType

    val eventClass: KClass<T>

    fun createNotification(payload: String): EmailMessage

    fun parseEvent(payload: String): T
}
