package com.axtstar.asta4d.sample.handler

import com.astamuse.asta4d.web.dispatch.request.RequestHandler
import com.astamuse.asta4d.web.form.flow.classical.ClassicalMultiStepFormFlowHandlerTrait
import com.axtstar.asta4d.sample.form.SampleForm

/**
  * axt
  */
class SampleFormFlowHandler extends ClassicalMultiStepFormFlowHandlerTrait[SampleForm] {
  override def getFormCls = {classOf[SampleForm]}

  override def createInitForm={
    val target = new SampleForm
    target.setName("test")
    target.setAge("30")
    target
  }

  override def updateForm(form: SampleForm): Unit = {

  }

  override def getTemplateBasePath: String = {
    "/form-flow/form-"
  }

  override def treatCompleteStepAsExit(): Boolean = {
    false
  }

}
