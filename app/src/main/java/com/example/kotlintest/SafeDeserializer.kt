package com.example.kotlintest

import com.google.gson.*
import java.lang.reflect.Type

/**
 * author: wenjie
 * date: 2021-08-06 17:21
 * descption:
 */
class SafeDeserializer : JsonDeserializer<Any> {

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Any {
        val jsonObject = json as JsonObject
        removeNullsFromJson(jsonObject)
        val any = Gson().fromJson<Any>(jsonObject, typeOfT)
        return any
    }

    private fun removeNullsFromJson(jsonObject: JsonObject) {
        val iterator = jsonObject.keySet().iterator()
        while (iterator.hasNext()) {
            val key = iterator.next()
            when (val json = jsonObject[key]) {
                is JsonObject -> removeNullsFromJson(json)
                is JsonNull -> iterator.remove()
            }
        }
    }
}