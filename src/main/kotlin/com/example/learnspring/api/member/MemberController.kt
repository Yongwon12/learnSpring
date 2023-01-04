package com.example.learnspring.api.member

import com.example.learnspring.api.member.domain.Member
import com.example.learnspring.api.member.repository.MemberRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController (
    val memberRepository: MemberRepository
){
    @GetMapping()
    fun getMember():ResponseEntity<*>{
        val users = memberRepository.findAll()
        return ResponseEntity.ok(users)
    }
    @PostMapping()
    fun setMember(@RequestBody member:Member):ResponseEntity<*>{
        val res = memberRepository.save(member)
        return ResponseEntity.ok(res)
    }
}