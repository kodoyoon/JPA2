package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext //엔티티 매니저 주입
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();

    }


    public Member find(Long id) { //조회
        return em.find(Member.class, id);
    }

}
