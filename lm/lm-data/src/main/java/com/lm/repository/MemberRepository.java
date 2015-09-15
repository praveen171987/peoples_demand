package com.lm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lm.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
