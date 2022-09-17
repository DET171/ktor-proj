package com.example.plugins

import com.example.routes.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
	routing {
		get("/") {
			call.respondText(
				"""
				Available routes:
				- GET /rot13/{text}
				  Encodes the received text using ROT13
				- GET /com.example.utils.sha256/{text}
				  Hashes the given text with SHA-256
				""".trimIndent()
			)
		}
		rot13Encryption()
		sha256Hash()
		md5Hash()
	}
}