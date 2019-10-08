package com.ukiyu.blog012rps;

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

	public List<String> winners() {
		if(result.size() != 2) return null;

		if(null == result.get(Hand.ROCK)) {
			return result.get(Hand.SCISSORS);
		}

		if(null == result.get(Hand.PAPER)) {
			return result.get(Hand.ROCK);
		}

		if(null == result.get(Hand.SCISSORS)) {
			return result.get(Hand.PAPER);
		}

		return null;
	}

	public List<String> losers() {
		if(result.size() != 2) return null;

		if(null == result.get(Hand.ROCK)) {
			return result.get(Hand.PAPER);
		}

		if(null == result.get(Hand.PAPER)) {
			return result.get(Hand.SCISSORS);
		}

		if(null == result.get(Hand.SCISSORS)) {
			return result.get(Hand.ROCK);
		}

		return null;
	}
}
