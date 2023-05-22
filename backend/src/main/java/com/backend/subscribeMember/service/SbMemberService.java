package com.backend.subscribeMember.service;


import com.backend.subscribeMember.dto.SubscribeMemberDto;
import com.backend.subscribeMember.dto.LastSbMemberDTO;
import org.springframework.stereotype.Service;

@Service
public interface SbMemberService {
    public void sbMemberAdd(SubscribeMemberDto subscribeMemberDto);

    public LastSbMemberDTO getLastSbMemberByMemberId();

}
