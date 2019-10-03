package com.mcguffin.darnassus.parser

import org.scalatest.{Matchers, WordSpec}

class DslParserSpec extends WordSpec
  with Matchers {

  val testDsl =
    """
      |{
      |  "source": "rabbit",
      |  "sink": "hbase"
      |}
      |""".stripMargin

  "DslParser" should {
    "parse the source and sink" in {
      val parsed = DslParser.parse(testDsl);
      parsed.source shouldEqual "rabbit"
      parsed.sink shouldEqual "hbase"
    }
  }
}
