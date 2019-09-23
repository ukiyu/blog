package com.ukiyu.blogTest;

public class Rectangle {
	@SuppressWarnings("unused")
	private final Position position;
	@SuppressWarnings("unused")
	private final Size size;

	private Rectangle(Position position, Size size) {
		this.position = position;
		this.size = size;
	}

	static public Rectangle of(Position position, Size size) {
		return new Rectangle(position, size);
	}


}
