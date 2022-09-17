package com.example.routes

import com.example.utils.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.rot13Encryption() {
	route("/rot13") {
		get("/{text?}") {
			val text = call.parameters["text"]
			if (text != null) {
				call.respondText(String(text.rot13()), ContentType.Text.Plain)
			} else {
				call.respondText("Please specify a text to encode by calling /rot13/{text}", ContentType.Text.Plain)
			}
		}
	}
}