package com.example.learnspring.api.member.repository

import com.example.learnspring.api.member.domain.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface MemberRepository : JpaRepository<Member,String>