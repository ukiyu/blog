package com.ukiyu.blogTest;

public class Position {
	private final Point position;

	private Position(Point position) {
		this.position = position;
	}

	static public Position of(Point position) {
		return new Position(position);
	}

	public Position move(Position other) {
		return of(position.plus(other.position));
	}
}
