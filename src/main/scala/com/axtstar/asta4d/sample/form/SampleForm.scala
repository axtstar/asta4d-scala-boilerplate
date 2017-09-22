package com.axtstar.asta4d.sample.form

import com.astamuse.asta4d.web.form.annotation.Form
import com.astamuse.asta4d.web.form.annotation.renderable.{Checkbox, Input}

import scala.collection.JavaConversions._

/**
  * Created by axt on 2017/09/19.
  */


@Form
class SampleForm {

  var check1:String = ""
  var check2:String = ""
  var check3:String = ""
  var check4:String = ""
  var check5:String = ""

  @Input(name="check1")
  def getCheck1()={
    check1
  }
  def setCheck1(args:String)={
    check1 = args
  }

  @Input(name="check2")
  def getCheck2()={
    check2
  }
  def setCheck2(args:String)={
    check2 = args
  }

  @Input(name="check3")
  def getCheck3()={
    check3
  }
  def setCheck3(args:String)={
    check3 = args
  }

  @Input(name="check4")
  def getCheck4()={
    check4
  }
  def setCheck4(args:String)={
    check4 = args
  }

  @Input(name="check5")
  def getCheck5()={
    check5
  }
  def setCheck5(args:String)={
    check5 = args
  }

}
