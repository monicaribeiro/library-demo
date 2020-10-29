package com.library.demo

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/books")
class BookController(
    private val bookService: BookService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody bookRequest: BookRequest): BookResponse {
        return BookResponse.fromBook(bookService.create(bookRequest.toBook()))
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getBooks(): List<BookResponse> {
        return bookService.getBooks().map { BookResponse.fromBook(it) }
    }
}
