package com.ukiyu.blog013rps;

import java.util.List;
import java.util.Map;

public class Result {
	private final Map<Hand, List<String>> result;

	private Result(Map<Hand, List<String>> result) {
		this.result = result;
	}

	static public Result of(Map<Hand, List<String>> result) {
		return new Result(result);
	}

	public boolean isDecided() {
		Hands hands = Hands.of(result.keySet());
		return hands.decidesMatch();
	}

	public List<String> winners() {
		Hands hands = Hands.of(result.keySet());
		return result.get(hands.strongest());
	}

	public List<String> losers() {
		Hands hands = Hands.of(result.keySet());
		return result.get(hands.weakest());
	}
}
