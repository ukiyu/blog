package com.ukiyu.blog016rps;

public class Profile {
	private final String name;
	private final int age;

	private Profile(String name, int age) {
		this.name = name;
		this.age = age;
	}

	static public Profile of(String name, int age) {
		return new Profile(name, age);
	}

	public String showName() {
		return name;
	}
	
	public String showNameWithAge() {
		return name + ", " + age;
	}
}
