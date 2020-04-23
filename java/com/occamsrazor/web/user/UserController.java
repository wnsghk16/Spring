package com.occamsrazor.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.util.Messenger;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired UserService userService;
	
	@PostMapping("/join")
	public Messenger add(@RequestBody User user) {
		int current = userService.count();
		userService.add(user);
		return (userService.count() == current+1)?Messenger.SUCCESS:Messenger.FAIL;
	}
	@PostMapping("/login")
	public Map<String,Object> login (@RequestBody User user) { //user타입인 loginUser이랑 Messenger타입인 SUCCESS를 보내야하므로 합쳐서 보내는건 map밖에 없다.
		Map<String,Object> returnMap = new HashMap<>();
		User loginUser = userService.login(user);
		
		if(loginUser != null) {
			returnMap.put("user", loginUser);
			returnMap.put("messenger", Messenger.SUCCESS);
		}else {
			returnMap.put("messenger", Messenger.FAIL);
		}
		
		return returnMap;
	}
}
