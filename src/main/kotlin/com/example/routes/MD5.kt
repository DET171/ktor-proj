package com.example.routes;

import io.ktor.http.ContentType
import com.example.utils.*
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import java.nio.charset.StandardCharsets
import java.security.MessageDigest


fun Route.md5Hash() {
	get("/md5/{text?}") {
		val text = call.parameters["text"] ?: return@get call.respondText("Missing parameter: text", status = HttpStatusCode.BadRequest)

		call.respondText(text.md5(), ContentType.Text.Plain)
	}
}