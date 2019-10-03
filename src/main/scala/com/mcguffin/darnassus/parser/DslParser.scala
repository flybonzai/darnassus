package com.mcguffin.darnassus.parser

import com.typesafe.config.ConfigFactory

object DslParser {
  case class Parsed(source: String, sink: String)

  def parse(dsl: String): Parsed = {
    val parser = ConfigFactory.parseString(dsl)
    Parsed(parser.getString("source"), parser.getString("sink"))
  }
}
