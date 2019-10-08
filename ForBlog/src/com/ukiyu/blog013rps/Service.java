package com.ukiyu.blog013rps;

import java.util.List;

public class Service {

	public static void main(String[] args) {
		System.out.println("013rps start.");

		Brain brainA = Brain.of(Hand.ROCK);
		Player playerA = Player.of("playerA", brainA);

		Brain brainB = Brain.of(Hand.ROCK);
		Player playerB = Player.of("playerB", brainB);

		Brain brainC = Brain.of(Hand.SCISSORS);
		Player playerC = Player.of("playerC", brainC);

		Players players = Players.of(playerA, playerB, playerC);

		Reports reports = players.rockPaperScissors();

		Result result = reports.toResult();

		if(!result.isDecided()) {
			System.out.println("Draw.");
			return;
		}

		List<String> winners = result.winners();
		System.out.println("win : " + winners);
		List<String> losers = result.losers();
		System.out.println("lose : " + losers);
	}

}
