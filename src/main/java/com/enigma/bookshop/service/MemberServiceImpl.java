package com.enigma.bookshop.service;


import com.enigma.bookshop.Constant.ResponsMessage;
import com.enigma.bookshop.entity.Member;
import com.enigma.bookshop.exception.DataNotFoundException;
import com.enigma.bookshop.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberRepository memberRepository;


    @Override
    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member getMemberId(Integer id) {
        verify(id);
        return memberRepository.findById(id).get();
    }

    @Override
    public List<Member> getAllMember() {
        return memberRepository.findAll();
    }

    @Override
    public Member updateMember(Member member) {
        verify(member.getId());
        return memberRepository.save(member);
    }

    @Override
    public void deleteMember(Integer id) {
        verify(id);
        memberRepository.deleteById(id);
    }

    private void verify(Integer id){
        if (!memberRepository.findById(id).isPresent()){
            String message = String.format(ResponsMessage.NOT_FOUND_MESSAGE, "Customer", id);
            throw new DataNotFoundException(message);
        }
    }
}
