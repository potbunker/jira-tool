package org.myhome.jira.tool

import com.rabbitmq.client.Connection
import com.rabbitmq.client.ConnectionFactory


class RabbitMQSource<T>(): EventSource<T>() {

    private val factory = ConnectionFactory()
    private lateinit var connection: Connection

    override fun preStart(): Unit {
        factory.host = "pizza"
        factory.port = 5672
        factory.username = "guest"
        factory.password = "guest"

        factory.newConnection()
    }

    override fun postStop(): Unit {

    }
    override fun createReceive(): Receive {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class RMQOptions(
        val host: String,
        val port: Int,
        val username: String,
        val password: String
)