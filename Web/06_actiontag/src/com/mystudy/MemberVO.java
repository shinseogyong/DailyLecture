package com.mystudy;

import java.util.Arrays;

public class MemberVO {
	private String name;
	private String id;
	private String pwd;
	private String email;
	private String gender;
	private String[] hobby;
	
	public MemberVO() {}
	
	public MemberVO(String name, String id, String pwd, String email, String gender, String[] hobby) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", id=" + id + ", pwd=" + pwd + ", email=" + email + ", gender=" + gender
				+ ", hobby=" + Arrays.toString(hobby) + "]";
	}
	
}
