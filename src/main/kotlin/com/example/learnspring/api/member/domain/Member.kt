package com.example.learnspring.api.member.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "member")
data class Member (
    @Id
    @Column(name = "id")
    var id: String = "",

    @Column(name = "name")
    var name: String = "",

    @Column(name = "password")
    var password: String = "",

    @Column(name = "email")
    var email: String = ""

)