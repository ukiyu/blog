package com.ukiyu.blog015rps.Brain;

import com.ukiyu.blog015rps.Hand;

public class SameHand implements Brain {
	private final Hand hand;

	private SameHand(Hand hand) {
		this.hand = hand;
	}

	static public Brain of(Hand hand) {
		return new SameHand(hand);
	}

	@Override
	public Hand next() {
		return hand;
	}
}
