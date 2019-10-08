package com.ukiyu.blog013rps;

public class Brain {
	private final Hand hand;

	private Brain(Hand hand) { // TODO 固定。毎回違う手を出す必要アリ。
		this.hand = hand;
	}

	static public Brain of(Hand hand) {
		return new Brain(hand);
	}

	public Hand next() {
		return hand;
	}
}
