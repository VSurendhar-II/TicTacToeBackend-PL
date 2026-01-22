package com.voiddeveloper

import com.voiddeveloper.model.TicTacToeGame
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting(game: TicTacToeGame) {
    routing {
        socket(game)
    }
}
