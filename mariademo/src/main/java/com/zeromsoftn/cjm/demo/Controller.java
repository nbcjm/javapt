package com.zeromsoftn.cjm.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("memberTest")
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MemberService mbrsvc;

    //모든 회원 조회
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<MemberVo>> getAllmembers(){
        List<MemberVo> member = mbrsvc.findAll();
        return new ResponseEntity<List<MemberVo>>(member, HttpStatus.OK);
    }

    //회원번호로 한 명 조회
    @GetMapping(value = "/{mbrNo}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<MemberVo> getMember(@PathVariable("mbrNo")Long mbrNo){
        Optional<MemberVo> member = mbrsvc.findById(mbrNo);
        return new ResponseEntity<MemberVo>(member.get(), HttpStatus.OK);
    }

    //삭제
    @DeleteMapping(value = "/{mbrNo}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Void> deleteMember(@PathVariable("mbrNo") Long mbrNo){
        mbrsvc.deleteById(mbrNo);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    //수정
    @PutMapping(value = "/{mbrNo}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<MemberVo> updatdeMember(@PathVariable("mbrNo")Long mbrNo, MemberVo member){
        mbrsvc.updateById(mbrNo, member);
        return new ResponseEntity<MemberVo>(member,HttpStatus.OK);
    }

    //회원 입력
    @PostMapping
    public ResponseEntity<MemberVo> save(MemberVo member){
        return new ResponseEntity<MemberVo>(mbrsvc.save(member), HttpStatus.OK);
    }

    //회원 입력
    @RequestMapping(value="/saveMember", method = RequestMethod.GET)
    public ResponseEntity<MemberVo> save(HttpServletRequest request, MemberVo member){
        return new ResponseEntity<MemberVo>(mbrsvc.save(member), HttpStatus.OK);
    }
}















