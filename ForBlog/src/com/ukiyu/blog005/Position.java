package com.ukiyu.blog005;

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

	@Override
	public String toString() {
		return "(x, y) = (" + x + ", " + y + ")";
	}

}
