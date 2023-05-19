package com.backend.subscribemember.service;


import com.backend.subscribemember.dto.LastSbMemberDTO;
import com.backend.subscribemember.dto.SubscribeMemberDto;
import org.springframework.stereotype.Service;

@Service
public interface SbMemberService {
    public void sbMemberAdd(SubscribeMemberDto subscribeMemberDto);

    public LastSbMemberDTO getLastSbMemberByMemberId();

}
