package com.ukiyu.blog012rps;

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
		Map<Hand, List<String>> result = new HashMap<>();
		reports.forEach((report) -> result.computeIfAbsent(
				report.hand, (unused) -> new LinkedList<>()).add(report.name));
		return Result.of(result);
	}

	static public class Report {
		private final String name;
		private final Hand hand;

		private Report(String name, Hand hand) {
			this.name = name;
			this.hand = hand;
		}

		static public Report of(String name, Hand hand) {
			return new Report(name, hand);
		}
	}

}
