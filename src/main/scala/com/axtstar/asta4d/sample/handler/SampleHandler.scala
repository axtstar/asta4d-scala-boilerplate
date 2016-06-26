package com.axtstar.asta4d.sample.handler

import com.astamuse.asta4d.web.dispatch.request.RequestHandler

/**
  * Created by tanakakazunari on 西暦16/06/25.
  */
class SampleHandler {
  @RequestHandler
  def handler() = {
    //
    val context = com.astamuse.asta4d.web.WebApplicationContext.getCurrentThreadWebApplicationContext
    // setDate to named "test1"
    context.setData("test1","test")

    val getData = context.getData[String]("test1")


    println(getData)

  }
}
