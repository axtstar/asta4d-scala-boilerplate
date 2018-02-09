package com.axtstar.asta4d.sample.snippet

import com.astamuse.asta4d.scala.R._
import com.astamuse.asta4d.render.Renderer
import com.astamuse.asta4d.web.form.annotation.renderable.Input
import org.slf4j.LoggerFactory

/**
 * @author astamuse
 */
class SampleSnippet {
  private val logger = LoggerFactory.getLogger(classOf[SampleSnippet])

  @Input (name="name")
  var name:String = ""

  @Input (name="age")
  var age:String = ""

  def setRenderer() = {
    // setDate to named "test1"
    ".x-name-input" ->  "value" -> ("name:" + name) &
    ".x-age-input" -> "value" -> ("age:" + age) &
    ".x-name" ->  name &
    ".x-age" -> age &
    ".x-list" -> List(1,2,3).map {
      x => {
        ".x-child" -> x.toString
      }
    }

  }
}