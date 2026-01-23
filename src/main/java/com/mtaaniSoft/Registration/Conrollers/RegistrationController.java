package com.mtaaniSoft.Registration.Conrollers;

import com.mtaaniSoft.Registration.Model.Member;
import com.mtaaniSoft.Registration.Service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Member> getMemberByIdNumber(@PathVariable String idNumber) {
        return memberService.getMemberByIdNumber(idNumber); // fetch specific member in the database
    }
    @PostMapping("addMember") // post mapping -- add the member
    public Member addMember(@RequestBody Member member){
        return memberService.addMember(member);
    }
    @PutMapping("updateMember{idNumber}")
    public Member updateMember(@PathVariable String idNumber, @RequestBody Member updateMember){
        return memberService.updateMember(idNumber, updateMember);
    }

}
