package com.mtaaniSoft.Registration.Service;

import com.mtaaniSoft.Registration.Dao.MemberDao;
import com.mtaaniSoft.Registration.Model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberService {

    private final MemberDao memberDao;

    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public List<Member> getAllMembers() {

        return memberDao.findAll();
    }
}
