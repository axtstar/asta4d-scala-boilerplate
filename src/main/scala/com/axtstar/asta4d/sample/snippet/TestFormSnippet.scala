package com.axtstar.asta4d.sample.snippet

import java.util

import com.astamuse.asta4d.web.form.field.{FormFieldPrepareRenderer, OptionValueMap, OptionValuePair}
import com.astamuse.asta4d.web.form.field.impl.CheckboxPrepareRenderer
import com.astamuse.asta4d.web.form.flow.classical.ClassicalMultiStepFormFlowSnippetTrait
import com.axtstar.asta4d.sample.form.{SampleForm, WeekDay}

import scala.collection.JavaConversions._
import scala.collection.mutable.ArrayBuffer


/**
 * @author astamuse
 */
class TestFormSnippet extends ClassicalMultiStepFormFlowSnippetTrait{

  override def retrieveFieldPrepareRenderers(renderTargetStep: String, form: scala.Any): java.util.List[FormFieldPrepareRenderer] = {
    val rendererList = ArrayBuffer.empty[FormFieldPrepareRenderer]
    rendererList.add(new CheckboxPrepareRenderer(classOf[SampleForm], "check")
      .setOptionData(WeekDay.asOptionValueMap))
    rendererList
  }
}
