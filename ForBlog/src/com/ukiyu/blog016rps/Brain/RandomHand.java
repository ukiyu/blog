package com.ukiyu.blog016rps.Brain;

import java.util.Random;

import com.ukiyu.blog016rps.Hand;

public class RandomHand implements Brain {
	private final Random generator;
	private final Hand selection[] = {Hand.ROCK, Hand.PAPER, Hand.SCISSORS};

	private RandomHand(long seed) {
		generator = new Random(seed);
	}

	static public RandomHand of(long seed) {
		return new RandomHand(seed);
	}

	@Override
	public Hand next() {
		int selected = generator.nextInt(selection.length);
		return selection[selected];
	}
}
