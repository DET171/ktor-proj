package com.example.utils;

fun String.rot13() = map {
	when {
		it.isUpperCase() -> { val x = it + 13; if (x > 'Z') x - 26 else x }
		it.isLowerCase() -> { val x = it + 13; if (x > 'z') x - 26 else x }
		else -> it
	} }.toCharArray()
