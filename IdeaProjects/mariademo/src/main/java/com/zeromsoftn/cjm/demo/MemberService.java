package com.zeromsoftn.cjm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepo memberrepo;

    public List<MemberVo> findAll(){
        List<MemberVo> members = new ArrayList<>();
        memberrepo.findAll().forEach(e -> members.add(e));
        return members;
    }

    public Optional<MemberVo> findById(Long mbrNo) {
        Optional<MemberVo> member = memberrepo.findById(mbrNo);
        return member;
    }
    public void deleteById(Long mbrNo){
        memberrepo.deleteById(mbrNo);
    }
    public MemberVo save(MemberVo member){
        memberrepo.save(member);
        return member;
    }

    public void updateById(Long mbrNo, MemberVo member){
        Optional<MemberVo> e = memberrepo.findById(mbrNo);

        if(e.isPresent()){
            e.get().setMbrNo(member.getMbrNo());
            e.get().setId(member.getId());
            e.get().setName(member.getName());
            memberrepo.save(member);
        }
    }
}
