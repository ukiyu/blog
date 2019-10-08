package com.ukiyu.blog012rps;

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

	public Reports.Report report() {
		return Reports.Report.of(name, brain.next());
	}

	@Override
	public String toString() {
		return name;
	}
}
