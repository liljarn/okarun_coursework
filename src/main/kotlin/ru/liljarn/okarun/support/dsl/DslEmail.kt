package ru.liljarn.okarun.support.dsl

import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper

private const val SENDER_NAME = "Точка с запятой"

fun email(init: EmailMessage.() -> Unit): EmailMessage {
    val emailMessage = EmailMessage()
    emailMessage.init()
    return emailMessage
}

fun JavaMailSender.sendEmail(email: EmailMessage) {
    val mimeMessage = this.createMimeMessage()
    val helper = MimeMessageHelper(mimeMessage, true)

    helper.setFrom("$SENDER_NAME <${email.from}>")
    helper.setTo(email.to)
    helper.setSubject(email.subject)

    when {
        email.html != null -> helper.setText(email.html!!, true)
        email.text != null -> helper.setText(email.text!!, false)
    }

    email.images.forEach { (cid, file) ->
        helper.addInline(cid, file)
    }

    this.send(mimeMessage)
}

