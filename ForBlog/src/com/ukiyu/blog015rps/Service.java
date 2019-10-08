package com.ukiyu.blog015rps;

import com.ukiyu.blog015rps.Brain.PeriodicHand;
import com.ukiyu.blog015rps.Brain.RandomHand;
import com.ukiyu.blog015rps.Brain.SameHand;

public class Service {

	public static void main(String[] args) {
		System.out.println("015rps start.");

		Player playerA = Player.of(
				Profile.of("playerA", 20),
				SameHand.of(Hand.ROCK)
				);
		Player playerB = Player.of(
				Profile.of("playerB", 30),
				RandomHand.of(1)
				);
		Player playerC = Player.of(
				Profile.of("playerC", 40),
				PeriodicHand.of()
				);
		Player playerD = Player.of(
				Profile.of("playerD", 40),
				RandomHand.of(31)
				);
		Players players = Players.of(playerA, playerB, playerC, playerD);

		for(int i = 0; i < 5; i++) {
			System.out.println("Trial : " + (i+1) );

			Reports reports = players.rockPaperScissors();
			Result result = reports.toResult();

			if(!result.isDecided()) {
				if(result.isAllSame()) {
					System.out.println("Draw. Same hand.");
					Hand.forEach(hand -> {
						result.profiles(hand).ifPresent(
								unused -> System.out.println(hand));
					});
				} else {
					System.out.println("Draw. Different hands.");
					Hand.forEach(hand -> showProfiles(result, hand) );
				}
				System.out.println();
				continue;
			}

			Hand handOfWinning = result.handOfWinners();
			System.out.print("win : ");
			showProfiles(result, handOfWinning);
			Hand handOfLosing = result.handOfLosers();
			System.out.print("lose : ");
			showProfiles(result, handOfLosing);
			System.out.println();
		}
	}

	static private void showProfiles(Result result, Hand hand) {
		result.profiles(hand).ifPresent(
				profiles -> System.out.println(hand + " : " + profiles.showNamesWithAge())
				);
	}
}
