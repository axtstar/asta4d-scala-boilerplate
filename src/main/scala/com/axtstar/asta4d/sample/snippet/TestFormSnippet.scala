package com.axtstar.asta4d.sample.snippet

import java.util

import com.astamuse.asta4d.render.Renderer
import com.astamuse.asta4d.web.form.field.{FormFieldPrepareRenderer, OptionValueMap, OptionValuePair}
import com.astamuse.asta4d.web.form.field.impl.CheckboxPrepareRenderer
import com.astamuse.asta4d.web.form.flow.base.FormRenderingData
import com.astamuse.asta4d.web.form.flow.classical.ClassicalMultiStepFormFlowSnippetTrait

import scala.collection.JavaConversions._
import scala.collection.mutable.ArrayBuffer
import com.astamuse.asta4d.scala.R._
import com.axtstar.asta4d.sample.form.SampleForm

/**
 * @author astamuse
 */
class TestFormSnippet extends ClassicalMultiStepFormFlowSnippetTrait {

  override def render(renderingData: FormRenderingData): Renderer = {
    ".x-list" -> List("1", "2", "3", "4", "5").map {
      x =>
        ".x-name" -> x &
          ".x-check" -> "name" -> ("check" + x) &
          ".x-check" -> "id" -> ("check" + x) &
          ".x-label" -> "for" -> ("check" + x) &
          ".x-label" -> ("LABEL" + x)
    }
  }
}