package com.backend.subscribeMember;

import com.backend.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface SbMemberRepository extends JpaRepository<SubscribeMember, Integer> {

    SubscribeMember findByMember(Member member);

    @Query(value = "select * from tb_subscribe_member where member_id = :memberId order by sb_start_date desc limit 1", nativeQuery = true)
    SubscribeMember getLastSbMemberByMemberId(String memberId);

    @Query(value = "select sb_member_num where meber_id = :memberId", nativeQuery = true)
    List<Integer> getSbMemberNum(String memberId);
}