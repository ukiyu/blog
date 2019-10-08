package com.ukiyu.blog015rps;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Players {
	private final List<Player> players;

	private Players(List<Player> players){
		this.players = players;
	}

	static public Players of(List<Player> players) {
		return new Players(players);
	}

	static public Players of(Player... player) {
		return new Players(Arrays.asList(player));
	}

	public Reports rockPaperScissors() {
		List<Reports.Report> reports = new LinkedList<>();
		players.forEach(player -> reports.add(player.report()));
		return Reports.of(reports);
	}
}
