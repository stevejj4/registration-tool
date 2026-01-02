package com.mtaaniSoft.Registration.Dao;

import com.mtaaniSoft.Registration.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MemberDao extends JpaRepository<Member, String> {
}
