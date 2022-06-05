package hello.hellospring.controller;

/**
 * packageName    : hello.hellospring.controller
 * fileName       : MemberController
 * author         : men16
 * date           : 2022-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-05        men16       최초 생성
 */

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}

