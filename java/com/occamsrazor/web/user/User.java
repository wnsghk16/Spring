package com.occamsrazor.web.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
	private String userid,passwd,name,ssn,addr;
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", userid,passwd,name,ssn,addr);
	}
}
