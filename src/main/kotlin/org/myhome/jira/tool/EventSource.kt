package org.myhome.jira.tool

import akka.actor.AbstractActor
import akka.event.Logging

abstract class EventSource<T> : AbstractActor() {

    val logger = Logging.getLogger(context.system, this)

    init {

    }


}

data class Options(val name: String)