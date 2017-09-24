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
import com.astamuse.asta4d.web.form.annotation.Form
import com.axtstar.asta4d.sample.form.SampleForm

/**
 * @author astamuse
 */
class TestFormSnippet extends ClassicalMultiStepFormFlowSnippetTrait {

  override def render(renderingData: FormRenderingData): Renderer = {
    ".x-step" -> "test"
  }


}
