package com.library.demo

data class BookResponse(
    val id: String,
    val name: String,
    val description: String,
    val url: String
) {
    companion object {
        fun fromBook(book: Book): BookResponse {
            return BookResponse(
                id = book.id,
                name = book.name,
                description = book.description,
                url = book.url
            )
        }
    }
}
