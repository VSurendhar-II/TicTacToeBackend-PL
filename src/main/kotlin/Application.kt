package com.voiddeveloper

import com.voiddeveloper.model.TicTacToeGame
import io.ktor.server.application.*

//fun main(args: Array<String>) {
//    io.ktor.server.netty.EngineMain.main(args)
//}

fun Application.module() {
    val game = TicTacToeGame()
    configureSerialization()
    configureMonitoring()
    configureSockets()
    configureRouting(game)
}
