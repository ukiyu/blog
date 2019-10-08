package com.ukiyu.blog016rps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Reports {
	private final List<Report> reports;

	private Reports(List<Report> reports) {
		this.reports = reports;
	}

	static public Reports of(List<Report> reports) {
		return new Reports(reports);
	}

	public Result toResult() {
		Map<Hand, List<Profile>> result = new HashMap<>();
		reports.forEach((report) -> result.computeIfAbsent(
				report.hand, (unused) -> new LinkedList<>()).add(report.profile));
		return Result.of(result);
	}

	static public class Report {
		private final Profile profile;
		private final Hand hand;

		private Report(Profile profile, Hand hand) {
			this.profile = profile;
			this.hand = hand;
		}

		static public Report of(Profile profile, Hand hand) {
			return new Report(profile, hand);
		}
	}

}
