package com.ukiyu.blog010rps;

public class Service {

	public static void main(String[] args) {
		System.out.println("010rps start.");

		Brain brainA = Brain.of();
		Player playerA = Player.of("playerA", brainA);

		Brain brainB = Brain.of();
		Player playerB = Player.of("playerB", brainB);

		Hand handA = playerA.hand();
		Hand handB = playerB.hand();

		if(handA.winsTo(handB)) {
			System.out.println("PlayerA won.");
		} else if(handB.winsTo(handA)) {
			System.out.println("PlayerB won.");
		} else {
			System.out.println("Draw.");
		}
	}

}
