package com.axtstar.asta4d.sample.snippet

import java.sql.Date
import scala.collection.mutable.ArrayBuffer
import org.jsoup.nodes.Element
import org.jsoup.parser.Tag
import com.astamuse.asta4d.render.Renderer
import org.slf4j.LoggerFactory

/**
 * @author astamuse
 */
class SampleSnippet {
  private val logger = LoggerFactory.getLogger(classOf[SampleSnippet])
  
  def setProfile(): Renderer = {
    val renderer = Renderer.create
    renderer.add("p#name span", "asta4d")
    logger.debug(renderer.toString())
    renderer
  }
}