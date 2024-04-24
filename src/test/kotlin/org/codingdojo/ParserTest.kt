package org.codingdojo;

import java.nio.charset.StandardCharsets
import mu.KotlinLogging
import org.apache.commons.io.IOUtils
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ParserTest {

    val parser = Parser()
    private val log = KotlinLogging.logger {}

    @Test
    fun shouldParseZeros()  {
        log.info { "******* ENTER TEST" }
        val fileContent = IOUtils.resourceToString("/zeros.txt", StandardCharsets.UTF_8)
        assertThat(fileContent).hasLineCount(4)
        assertThat(fileContent).contains("| |")
        assertThat(parser.parse(fileContent)).isNull()
        //assertThat(parser.parse(fileContent)).isEqualTo("000000000")
    }

}