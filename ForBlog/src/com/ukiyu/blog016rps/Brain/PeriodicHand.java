package com.ukiyu.blog016rps.Brain;

import com.ukiyu.blog016rps.Hand;

public class PeriodicHand implements Brain {
	private int index = 0;
	private final Hand selection[] = {
			Hand.ROCK, Hand.SCISSORS, Hand.PAPER,
			Hand.PAPER, Hand.ROCK, Hand.SCISSORS
	};

	private PeriodicHand() {}

	static public PeriodicHand of() {
		return new PeriodicHand();
	}

	@Override
	public Hand next() {
		index %= selection.length;
		return selection[index++];
	}
}
