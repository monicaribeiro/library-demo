package com.library.demo

import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class BookServiceImpl(
    private val bookRepository: BookRepository
) : BookService {

    override fun getBooks(): List<Book> {
        return bookRepository.findAll()
    }

    override fun create(book: Book): Book {
        return bookRepository.save(book)
    }

}
