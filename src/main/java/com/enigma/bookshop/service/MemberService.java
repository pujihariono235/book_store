package com.enigma.bookshop.service;

import com.enigma.bookshop.entity.Member;

import java.util.List;

public interface MemberService {
    public Member addMember(Member member);
    public Member getMemberId(Integer id);
    public List<Member> getAllMember();
    public Member updateMember(Member member);
    public void deleteMember(Integer id);
}
