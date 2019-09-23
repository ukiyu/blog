package com.ukiyu.blog007;

public class Position {
	private final double x;
	private final double y;

	private Position(double x, double y) {
		this.x = x;
		this.y = y;
	}

	static public Position of(double x, double y) {
		return new Position(x, y);
	}

	public Position plus(Position other) {
		return of(x + other.x, y + other.y);
	}

	@Override
	public String toString() {
		return "(x, y) = (" + x + ", " + y + ")";
	}

}
