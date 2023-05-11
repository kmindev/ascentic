package com.backend.order;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberInfoDto {

    private String email;
    private String domain;
    private String name;
    private String tel;

}
