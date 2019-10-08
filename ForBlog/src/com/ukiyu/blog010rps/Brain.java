package com.ukiyu.blog010rps;

public class Brain {
	private Brain() {

	}

	static public Brain of() {
		return new Brain();
	}

	public Hand next() {
		return Hand.ROCK; // TODO 固定。毎回違う手を出す必要アリ。
	}
}
