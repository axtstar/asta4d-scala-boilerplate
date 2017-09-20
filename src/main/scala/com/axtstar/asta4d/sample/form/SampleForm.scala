package com.axtstar.asta4d.sample.form

import com.astamuse.asta4d.web.form.annotation.Form
import com.astamuse.asta4d.web.form.annotation.renderable.{Checkbox, Input}
import com.astamuse.asta4d.web.form.field.{OptionValueMap, OptionValuePair}
import com.axtstar.asta4d.sample.form.WeekDay.WeekDay

import scala.collection.JavaConversions._

/**
  * Created by axt on 2017/09/19.
  */

object WeekDay extends Enumeration {
  type WeekDay = Value
  val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value

  def asOptionValueMap: OptionValueMap = {
    new OptionValueMap(
      WeekDay.values.map { day =>
        new OptionValuePair(day.id.toString, day.toString)
      }.toList
    )
  }
}


@Form
class SampleForm {

  var name:String = ""
  var email:String = ""
  var check:Array[WeekDay.ValueSet] = Array()

  @Input(name="name")
  def getName() ={
    name
  }
  def setName(args:String)={
    name = args
  }

  @Input(name="email")
  def getEmail() ={
    email
  }
  def setEmail(args:String)={
    email = args
  }

  @Checkbox(name="check")
  def getCheck()={
    check
  }
  def setCheck(args:Array[WeekDay.ValueSet])={
    check = args
  }


}
