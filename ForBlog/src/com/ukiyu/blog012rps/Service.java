package com.ukiyu.blog012rps;

import java.util.List;

public class Service {

	public static void main(String[] args) {
		System.out.println("012rps start.");

		Brain brainA = Brain.of(Hand.ROCK);
		Player playerA = Player.of("playerA", brainA);

		Brain brainB = Brain.of(Hand.ROCK);
		Player playerB = Player.of("playerB", brainB);

		Brain brainC = Brain.of(Hand.SCISSORS);
		Player playerC = Player.of("playerC", brainC);

		Players players = Players.of(playerA, playerB, playerC);

		Reports reports = players.rockPaperScissors();

		Result result = reports.toResult();

		List<String> winners = result.winners();
		if(winners == null) {
			System.out.println("Draw.");
			return;
		}

		System.out.println("win : " + winners);
		System.out.println("lose : " + result.losers());
	}

}
