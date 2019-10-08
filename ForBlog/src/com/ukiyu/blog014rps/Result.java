package com.ukiyu.blog014rps;

import java.util.List;
import java.util.Map;

public class Result {
	private final Map<Hand, List<Profile>> result;

	private Result(Map<Hand, List<Profile>> result) {
		this.result = result;
	}

	static public Result of(Map<Hand, List<Profile>> result) {
		return new Result(result);
	}

	public boolean isDecided() {
		Hands hands = Hands.of(result.keySet());
		return hands.decidesMatch();
	}

	public Profiles winners() {
		Hands hands = Hands.of(result.keySet());
		return Profiles.of(result.get(hands.strongest()));
	}

	public Profiles losers() {
		Hands hands = Hands.of(result.keySet());
		return Profiles.of(result.get(hands.weakest()));
	}
}
