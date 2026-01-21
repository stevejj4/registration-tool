package com.mtaaniSoft.Registration.Conrollers;

import com.mtaaniSoft.Registration.Model.Member;
import com.mtaaniSoft.Registration.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class RegistrationController {

    private final MemberService memberService; // Using constructor injection

    public RegistrationController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("allMembers")
    public List<Member> getAllMembers(){
        return memberService.getAllMembers(); // fetch members from database
    }

    @GetMapping("{idNumber}")
    public List<Member> getMemberByIdNumber(@PathVariable String idNumber) {
        return memberService.getMemberByIdNumber(idNumber); // fetch specific member in the database
    }
    @PostMapping("addMember") // post mapping -- add the member
    public Member addMember(@RequestBody Member member){
        return memberService.addMember(member);
    }

}
