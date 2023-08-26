package com.playground.demo

class User(
    var name: String,
    var age: Int,
    var email: String
)

class Address {

    private var street: String? = null
    private var province: String? = null

    constructor(street: String, province: String) {
        this.street = street
        this.province = province
    }
}

class Grade {
    var gpa: Int = 0
    var gpx: Int = 0
    init {
        gpa = 1
        gpx = 1
    }
}

fun main() {
    val user = User("", 0, "")
    val address = Address("", "")
    val grade = Grade()
}