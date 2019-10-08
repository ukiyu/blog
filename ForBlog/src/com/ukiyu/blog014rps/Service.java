package com.ukiyu.blog014rps;

public class Service {

	public static void main(String[] args) {
		System.out.println("014rps start.");

		Brain brainA = Brain.of(Hand.ROCK);
		Player playerA = Player.of(Profile.of("playerA", 20), brainA);

		Brain brainB = Brain.of(Hand.ROCK);
		Player playerB = Player.of(Profile.of("playerB", 30), brainB);

		Brain brainC = Brain.of(Hand.SCISSORS);
		Player playerC = Player.of(Profile.of("playerC", 40), brainC);

		Players players = Players.of(playerA, playerB, playerC);

		Reports reports = players.rockPaperScissors();

		Result result = reports.toResult();

		if(!result.isDecided()) {
			System.out.println("Draw.");
			return;
		}

		Profiles winners = result.winners();
		System.out.println("win : " + winners.showNamesWithAge());
		Profiles losers = result.losers();
		System.out.println("lose : " + losers.showNamesWithAge());
	}

}
