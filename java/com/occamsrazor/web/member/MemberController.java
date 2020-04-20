package com.occamsrazor.web.member;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	public MemberService memberService;
	
	@PostMapping("/join")//자바 영역이라 싱글쿼터쓰면 안되고 더블쿼터("") 써야함
	public Member add(@RequestBody Member member) {
		System.out.println(">>>>>");
		System.out.println(member.toString());
		memberService = new MemberServiceImpl();
		memberService.add(member); //보안상 
		return member;
	}
}
