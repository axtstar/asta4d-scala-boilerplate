package com.axtstar.asta4d.sample.rules

import com.astamuse.asta4d.scala.handyrule.SHandyRuleSet
import com.astamuse.asta4d.web.dispatch.HttpMethod
import com.astamuse.asta4d.web.dispatch.mapping.handy.HandyRuleSet
import com.astamuse.asta4d.web.dispatch.mapping.{UrlMappingRuleRewriter, UrlMappingRule, UrlMappingRuleInitializer}
import org.slf4j.LoggerFactory
import com.astamuse.asta4d.web.dispatch.HttpMethod._

/**
  * @author astamuse
  */
class UrlRuleInitializer extends UrlMappingRuleInitializer[SHandyRuleSet] {

  private val logger = LoggerFactory.getLogger(classOf[UrlRuleInitializer])

  private lazy val nullHttpMethod: HttpMethod = null

  override def initUrlMappingRules(rules: SHandyRuleSet) = {
    rules.add("/", "/index.html")
    rules.add(POST, "/index2.html","/index2.html")
  }
}
