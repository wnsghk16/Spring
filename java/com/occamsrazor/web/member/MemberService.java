package com.occamsrazor.web.member;

public interface MemberService {
	public void add(Member member);
	public Member[] list();
	public Member detail(String userid);
	public int count();
	public void update(Member member);
	public void delete(Member member);
}
