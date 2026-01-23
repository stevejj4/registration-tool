package com.mtaaniSoft.Registration.Dao;

import com.mtaaniSoft.Registration.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberDao extends JpaRepository<Member, Long> {
    Optional<Member> findByIdNumber(String idNumber);
}