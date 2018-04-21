package org.myhome.jira.tool

import akka.actor.ActorSystem


fun main(args: Array<String>) {
    val system = ActorSystem.create("helloakka")
    system.terminate()
}

