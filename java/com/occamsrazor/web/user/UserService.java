package com.occamsrazor.web.user;

public interface UserService {
	public void add(User user);
	public int count();
	public User login(User user);
	public User detail(String userid);
	public boolean update(User user);
	public boolean delete(String userid);
}
