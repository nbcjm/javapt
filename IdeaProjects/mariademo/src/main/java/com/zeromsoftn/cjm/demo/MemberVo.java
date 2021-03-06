package com.zeromsoftn.cjm.demo;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@javax.persistence.Entity(name = "member")
public class MemberVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mbrNo;
    private String id;
    private String name;

    @Builder
    public MemberVo(String id, String name){
        this.id = id;
        this.name = name;
    }
}
