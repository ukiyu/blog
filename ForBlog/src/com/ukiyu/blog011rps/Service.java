package com.ukiyu.blog011rps;

import java.util.List;

public class Service {

	public static void main(String[] args) {
		System.out.println("011rps start.");

		Judge judge = Judge.of();

		Brain brainA = Brain.of(Hand.ROCK);
		Player playerA = Player.of("playerA", brainA);
		judge.record(playerA.hand(), playerA);

		Brain brainB = Brain.of(Hand.ROCK);
		Player playerB = Player.of("playerB", brainB);
		judge.record(playerB.hand(), playerB);

		Brain brainC = Brain.of(Hand.SCISSORS);
		Player playerC = Player.of("playerC", brainC);
		judge.record(playerC.hand(), playerC);

		List<Player> winners = judge.winners();
		if(winners == null) {
			System.out.println("Draw.");
			return;
		}

		System.out.println("win : " + winners);
		System.out.println("lose : " + judge.losers());
	}

}
