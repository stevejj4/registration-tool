package com.mtaaniSoft.Registration.Dao;

import com.mtaaniSoft.Registration.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface MemberDao extends JpaRepository<Member, String> {
    List<Member> findByIdNumber(String idNumber);
}
