package com.ukiyu.blog015rps;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

	public Hand handOfWinners() {
		Hands hands = Hands.of(result.keySet());
		return hands.strongest();
	}

	public Hand handOfLosers() {
		Hands hands = Hands.of(result.keySet());
		return hands.weakest();
	}

	public Optional<Profiles> profiles(Hand hand) {
		List<Profile> profile = result.get(hand);
		if(profile == null) return Optional.empty();
		return Optional.of(Profiles.of(profile));
	}

	public Profiles profilesAll() {
		List<Profile> all = result.values().stream().reduce(new LinkedList<>(), (profile0, profile1)->{ profile0.addAll(profile1); return profile0;});
		return Profiles.of(all);
	}

	public boolean isAllSame() {
		Hands hands = Hands.of(result.keySet());
		return hands.isAllSame();
	}
}
