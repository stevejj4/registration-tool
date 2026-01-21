package com.mtaaniSoft.Registration.Conrollers;

import com.mtaaniSoft.Registration.Model.Member;
import com.mtaaniSoft.Registration.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("registered")
public class RegistrationController {


    private final MemberService memberService;

    public RegistrationController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("allMembers")
    public List<Member> getAllMembers(){
        return memberService.getAllMembers(); // fetch members from database
    }

}
