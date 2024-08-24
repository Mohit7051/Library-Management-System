package com.app.LibraryManagementSystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.app.LibraryManagementSystem.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
