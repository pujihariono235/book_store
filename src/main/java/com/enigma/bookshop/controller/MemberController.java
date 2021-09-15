package com.enigma.bookshop.controller;


import com.enigma.bookshop.entity.Member;
import com.enigma.bookshop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/members")
    public Member createMember(@RequestBody Member member){
        return memberService.addMember(member);
    }

    @GetMapping("/members/{id}")
    public Member getMemberByid(@PathVariable Integer id){
        return memberService.getMemberId(id);
    }

    @GetMapping("/members")
    public List<Member> getAllMember(){
        return memberService.getAllMember();
    }

    @PutMapping("/members")
    public Member updateMember(@RequestBody Member member){
        return memberService.updateMember(member);
    }

    @DeleteMapping("/members/{id}")
    public void deleteMember(@PathVariable Integer id){
        memberService.deleteMember(id);
    }
}
