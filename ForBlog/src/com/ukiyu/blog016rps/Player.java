package com.ukiyu.blog016rps;

import com.ukiyu.blog016rps.Brain.Brain;

public class Player {
	private final Profile profile;
	private final Brain brain;

	private Player(Profile profile, Brain brain) {
		this.profile = profile;
		this.brain = brain;
	}

	static public Player of(Profile profile, Brain brain) {
		return new Player(profile, brain);
	}

	public Reports.Report report() {
		return Reports.Report.of(profile, brain.next());
	}
}
