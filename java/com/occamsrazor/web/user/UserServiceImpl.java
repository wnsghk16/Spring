package com.occamsrazor.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	private Map<String, Object> map; //키값으로 찾기때문에 count 필요 없음
	
	public UserServiceImpl() {
		map = new HashMap<>();
	}
	@Override
	public void add(User user) {
		map.put(user.getUserid(), user);
	}
	@Override
	public int count() {
		return map.size();
	}	
	@Override
	public User login(User user) {
		User returnUser = null;
		if(map.containsKey(user.getUserid())) { //키와 일치하는게 있으면
			User u = detail(user.getUserid()); // 그 키를가진 user정보를 u에 넣고
			if(user.getPasswd().equals(u.getPasswd())) { //입력받은 비밀번호와 유저의 비밀번호 비교해서 같으면
				returnUser = u; //유저 정보를 반환함
			}
		}		
		return returnUser;
	}
	@Override
	public User detail(String userid) {
		return (User) map.get(userid); //다운캐스팅
	}
	@Override
	public boolean update(User user) { //로그인한 상태에서 업데이트하는거라서 무조건 true
		map.replace(user.getUserid(), user);
		return true;
	}
	@Override
	public boolean delete(String userid) { //로그인한 상태에서 삭제하는거라서 무조건 true
		map.remove(userid);
		return true;
	}

}
