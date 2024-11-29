package ru.liljarn.okarun.support.json

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import kotlin.reflect.KClass

object JsonUtils {

    val mapper = ObjectMapper().apply {
        findAndRegisterModules()
        enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
        enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)
        enable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)
        disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
        disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)
        disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
    }

    fun <T : Any> toJson(obj: T): String = mapper.writeValueAsString(obj)

    fun <T : Any> fromJson(json: String, type: KClass<T>): T = mapper.readValue(json, type.java)

}
