package com.ukiyu.blog013rps;

import java.util.Set;

public class Hands {
	private final Set<Hand> hands;

	private Hands(Set<Hand> hands) {
		this.hands = hands;
	}

	static public Hands of(Set<Hand> hands) {
		return new Hands(hands);
	}

	public boolean decidesMatch() {
		if(hands.size() == 2) return true;
		return false;
	}

	public Hand strongest() {
		return hands.stream().reduce(Hand.WEAKEST, (hand0, hand1) -> hand0.winsTo(hand1) ? hand0:hand1);
	}

	public Hand weakest() {
		return hands.stream().reduce(Hand.STRONGEST, (hand0, hand1) -> hand0.losesTo(hand1) ? hand0:hand1);
	}
}
