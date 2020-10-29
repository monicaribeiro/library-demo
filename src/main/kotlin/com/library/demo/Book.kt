package com.library.demo

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
data class Book(
    @Id
    val id: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "description")
    val description: String,

    @Column(name = "url")
    val url: String,

    @Column(name = "stars")
    val stars: Int
) {
    constructor() : this("", "", "", "", 0) {

    }
}
