package com.library.demo

interface BookService {
    fun getBooks(): List<Book>
    fun create(book: Book): Book
}
