package com.lala.jd;

public class Person {

	private Integer id;
	private String name;
	private String nick;
	
	public Person(Integer id, String name, String nick)
	{
		this.id = id;
		this.name = name;
		this.nick = nick;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
}
