package com.ukiyu.blog005;

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

	public Rectangle addXY(double x, double y) {
		//return of(this.x + x, this.y + y, this.height, this.width);
		return null;
	}

	@Override
	public String toString() {
		return "Rectangle " + position + ", " + size;
	}

}
