package com.ukiyu.blog011rps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Judge {
	private final Map<Hand, List<Player>> count = new HashMap<>();

	private Judge() {}

	static public Judge of() {
		return new Judge();
	}

	public void record(Hand hand, Player player) {
		count.computeIfAbsent(hand, (unused) -> new LinkedList<>()).add(player);
	}

	public List<Player> winners() {
		if(count.size() != 2) return null;

		if(null == count.get(Hand.ROCK)) {
			return count.get(Hand.SCISSORS);
		}

		if(null == count.get(Hand.PAPER)) {
			return count.get(Hand.ROCK);
		}

		if(null == count.get(Hand.SCISSORS)) {
			return count.get(Hand.PAPER);
		}

		return null;
	}

	public List<Player> losers() {
		if(count.size() != 2) return null;

		if(null == count.get(Hand.ROCK)) {
			return count.get(Hand.PAPER);
		}

		if(null == count.get(Hand.PAPER)) {
			return count.get(Hand.SCISSORS);
		}

		if(null == count.get(Hand.SCISSORS)) {
			return count.get(Hand.ROCK);
		}

		return null;
	}
}
