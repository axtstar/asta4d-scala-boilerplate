package com.axtstar.asta4d.sample.form

import com.astamuse.asta4d.web.form.annotation.Form
import com.astamuse.asta4d.web.form.annotation.renderable.{Checkbox, Input}

import scala.collection.JavaConversions._

/**
  * Created by axt on 2017/09/19.
  */


@Form
class SampleForm {

  var name:String = ""
  var age:String = ""

  @Input(name="name")
  def getName()={
    name
  }
  def setName(args:String)={
    name = args
  }

  @Input(name="age")
  def getAge()={
    age
  }
  def setAge(args:String)={
    age = args
  }
}
