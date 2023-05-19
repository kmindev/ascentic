package com.backend.subscribemember.service;

import com.backend.member.entity.Member;
import com.backend.member.jwt.SecurityUtils;
import com.backend.member.repository.MemberRepository;
import com.backend.subscribemember.entity.SubscribeMember;
import com.backend.subscribemember.dto.LastSbMemberDTO;
import com.backend.subscribemember.dto.SubscribeMemberDto;
import com.backend.subscribemember.repository.SbMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@RequiredArgsConstructor
@Service
public class SbMemberServiceImpl implements SbMemberService {

    private final SbMemberRepository sbMemberRepository;
    private final MemberRepository memberRepository;

    @Override
    public void sbMemberAdd(SubscribeMemberDto subscribeMemberDto) {

        // 토큰으로 멤버 가져옴
        String currentMemberId = SecurityUtils.getCurrentMemberId().get();
        Member memberNow = this.memberRepository.findById(currentMemberId).orElse(null);

        // 구독회원 빌드
        SubscribeMember subscribeMember = SubscribeMember.builder()
                .member(memberNow)
                .sbStartDate(subscribeMemberDto.getStartDate())
                .sbEndDate(subscribeMemberDto.getEndDate())
                .sbMemberName(subscribeMemberDto.getMemberName())
                .sbMemberTel(subscribeMemberDto.getMemberTel())
                .sbMainAddr(subscribeMemberDto.getMainAddress())
                .sbSubAddr(subscribeMemberDto.getSubAddress())
                .sbShipMessage(subscribeMemberDto.getShipMessage())
                .sbPay(subscribeMemberDto.getPaymentMethod())
                .sbPaymentDay(subscribeMemberDto.getMonthPaymentDate())
                .sbPrice(subscribeMemberDto.getPrice())
                .tasteResult(subscribeMemberDto.getTasteResult())
                .build();

        //  저장
        sbMemberRepository.save(subscribeMember);
    }

    @Override
    public LastSbMemberDTO getLastSbMemberByMemberId() {

        // 토큰으로 멤버아이디 가져옴
        String currentMemberId = SecurityUtils.getCurrentMemberId().get();
        Member member = memberRepository.findById(currentMemberId).orElse(null);

        // 멤버 아이디로 마지막 구독정보 가져옴
        SubscribeMember lastSbMemberByMemberId = sbMemberRepository.getLastSbMemberByMemberId(currentMemberId);
        LastSbMemberDTO lastSbMemberDTO = LastSbMemberDTO.builder()
                .sbStartDate(lastSbMemberByMemberId.getSbStartDate())
                .sbEndDate(lastSbMemberByMemberId.getSbEndDate())
                .sbPay(lastSbMemberByMemberId.getSbPay())
                .sbPaymentDay(lastSbMemberByMemberId.getSbPaymentDay())
                .memberName(member.getName())
                .mainAddress(lastSbMemberByMemberId.getSbMainAddr())
                .subAddress(lastSbMemberByMemberId.getSbSubAddr())
                .build();
        return lastSbMemberDTO;
    }


    public SubscribeMember findSbMember(Integer id){
        SubscribeMember byId = sbMemberRepository.findById(id).orElse(null);
        return byId;
    }

    public void endSubscription(){
        // 토큰으로 멤버아이디 가져옴
        String currentMemberId = SecurityUtils.getCurrentMemberId().get();
        Member memberNow = this.memberRepository.findById(currentMemberId).orElse(null);

        //  구독 진행중인 데이터 가져옴
        SubscribeMember lastSbMemberByMemberId = sbMemberRepository.getLastSbMemberByMemberId(currentMemberId);

        //  구독종료일 업데이트
        LocalDate today = LocalDate.now();
        lastSbMemberByMemberId.setSbEndDate(today);
        sbMemberRepository.save(lastSbMemberByMemberId);

    }
}
