package com.library.demo

import java.util.*

data class BookRequest(
    val name: String,
    val description: String,
    val url: String,
    val stars: Int
) {
    fun toBook() = Book(
        id = UUID.randomUUID().toString(),
        name = name,
        description = description,
        url = url,
        stars = stars
    )
}
