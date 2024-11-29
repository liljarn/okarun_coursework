package ru.liljarn.okarun.support.dsl

import java.io.File

class EmailMessage {
    var from: String = ""
    var to: String = ""
    var subject: String = ""
    var text: String? = null
    var html: String? = null
    val images = mutableListOf<Pair<String, File>>()

    fun from(address: String) {
        from = address
    }

    fun to(address: String) {
        to = address
    }

    fun subject(title: String) {
        subject = title
    }

    fun text(content: String) {
        text = content
    }

    fun html(content: String) {
        html = content
    }


    fun image(cid: String, file: File) {
        images.add(cid to file)
    }
}
