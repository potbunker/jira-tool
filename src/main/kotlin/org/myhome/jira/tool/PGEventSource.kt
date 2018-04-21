package org.myhome.jira.tool

import java.sql.DriverManager
import java.util.*
import java.util.concurrent.CompletableFuture

class PGEventSource<String> {
    fun start(){
        val url = "jdbc:postgresql://pizza.myhomr.org/event_store"
        val info = Properties()
        //DriverManager.getConnection(url, info)
    }
}