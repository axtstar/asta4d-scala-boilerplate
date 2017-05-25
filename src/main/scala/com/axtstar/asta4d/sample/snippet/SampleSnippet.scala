package com.axtstar.asta4d.sample.snippet

import com.astamuse.asta4d.scala.R._
import com.astamuse.asta4d.render.Renderer
import org.slf4j.LoggerFactory

/**
 * @author astamuse
 */
class SampleSnippet {
  private val logger = LoggerFactory.getLogger(classOf[SampleSnippet])
  
  def setInpteText(): Renderer = {
    val context = com.astamuse.asta4d.web.WebApplicationContext.getCurrentThreadWebApplicationContext
    // setDate to named "test1"
    ".x-input-text" ->  "value" -> "AA"
  }
}