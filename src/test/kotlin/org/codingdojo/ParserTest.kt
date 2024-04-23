package org.codingdojo;

import java.nio.charset.StandardCharsets
import org.apache.commons.io.IOUtils
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ParserTest {

    val parser = Parser()

    @Test
    fun shouldParseZeros()  {
        val fileContent = IOUtils.resourceToString("/zeros.txt", StandardCharsets.UTF_8)
        assertThat(fileContent).hasLineCount(4)
        assertThat(parser.parse(fileContent)).isNull()
        //assertThat(parser.parse(fileContent)).isEqualTo("000000000")
    }

}