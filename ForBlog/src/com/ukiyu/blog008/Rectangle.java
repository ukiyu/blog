package com.ukiyu.blog008;

public class Rectangle {
	private final Position position;
	private final Size size;

	private Rectangle(Position position, Size size) {
		this.position = position;
		this.size = size;
	}

	static public Rectangle of(Position position, Size size) {
		return new Rectangle(position, size);
	}

	public Rectangle plus(Position other) {
		return of(position.plus(other), size);
	}

	public Rectangle plus(Size other) {
		return of(position, size.plus(other));
	}

	public Rectangle resize(Size.Rate rate) {
		return of(position, size.multiply(rate));
	}

	@Override
	public String toString() {
		return "Rectangle " + position + ", " + size;
	}

}
