package com.ukiyu.blog011rps;

public class Player {
	private final String name;
	private final Brain brain;

	private Player(String name, Brain brain) {
		this.name = name;
		this.brain = brain;
	}

	static public Player of(String name, Brain brain) {
		return new Player(name, brain);
	}

	public Hand hand() {
		return brain.next();
	}

	@Override
	public String toString() {
		return name;
	}
}
