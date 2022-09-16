package com.example.plugins

import io.ktor.server.routing.*
import com.example.routes.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
	routing {
		get("/") {
			call.respondText("""
				Available routes:
				- GET /rot13/{text}
				  Encodes the received text using ROT13
			""".trimIndent())
		}
		ROT13()
	}
}
