package com.axtstar.asta4d.sample.rules

import java.awt.image.SampleModel

import com.astamuse.asta4d.scala.handyrule.SHandyRuleSet
import com.astamuse.asta4d.web.dispatch.HttpMethod
import com.astamuse.asta4d.web.dispatch.mapping.UrlMappingRuleInitializer
import com.axtstar.asta4d.sample.handler.{SampleFormFlowHandler, SampleHandler}
import org.slf4j.LoggerFactory
import com.astamuse.asta4d.web.dispatch.HttpMethod._

/**
  * @author astamuse
  */
class UrlRuleInitializer extends UrlMappingRuleInitializer[SHandyRuleSet] {

  private val logger = LoggerFactory.getLogger(classOf[UrlRuleInitializer])

  private lazy val nullHttpMethod: HttpMethod = null


  override def initUrlMappingRules(rules: SHandyRuleSet) = {

    rules.add(GET, "/", "/index.html")

    rules.add(GET, "/index.html")
      .handler(new SampleHandler)
      .forward("/index.html")

    rules.add(POST,"/","/index.html")

    rules.add(POST,"/index.html")
      .handler(new SampleHandler)
      .redirect("/index.html")

    rules.add(GET, "/form")
    .handler(new SampleFormFlowHandler)

    rules.add(POST, "/form")
      .handler(new SampleFormFlowHandler)


  }
}
