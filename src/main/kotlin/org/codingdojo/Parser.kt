package org.codingdojo

import mu.KotlinLogging

class Parser {

    private val log = KotlinLogging.logger {}

    fun parse(text: String?): String? {
        log.info { "Enter parsing text: \n$text" }
        return null
    }

}