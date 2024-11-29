package ru.liljarn.okarun.domain.model.type

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue

enum class NotificationType {
    GREETING,
    NEW_RESERVATION,
    START_RENT,
    END_RENT,
    OVERDUE_RENT,
    ADMIN_MAILING,

    @JsonEnumDefaultValue
    UNKNOWN
}
