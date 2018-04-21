package org.myhome.jira.tool

import akka.actor.AbstractActor
import akka.event.Logging

abstract class EventSource() : AbstractActor() {

    val logger = Logging.getLogger(context.system, this)

    fun init(options: Options) {

    }


}

data class Options(val name: String)