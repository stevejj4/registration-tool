package com.mtaaniSoft.Registration.Service;

import com.mtaaniSoft.Registration.Dao.MemberDao;
import com.mtaaniSoft.Registration.Model.Member;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberDao memberDao;

    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public Optional<Member> getMemberByIdNumber(String idNumber) {
        return memberDao.findByIdNumber(idNumber);
    }

    public List<Member> getAllMembers() {
        return memberDao.findAll();
    }

    public Member addMember(Member member) {
        return memberDao.save(member); // after adding the member we need to save
    }
    public Member updateMember(String idNumber, Member updatedMember) {
        // Step 1: Find existing member
        Member existingMember = memberDao.findByIdNumber(idNumber)
                .orElseThrow(() -> new RuntimeException("Member not found"));

        // Step 2: Update fields
        existingMember.setMemberName(updatedMember.getMemberName());
        existingMember.setPrimaryPhoneNumber(updatedMember.getPrimaryPhoneNumber());
        // ... update other fields as needed

        // Step 3: Save back to DB
        return memberDao.save(existingMember);

    }
}
