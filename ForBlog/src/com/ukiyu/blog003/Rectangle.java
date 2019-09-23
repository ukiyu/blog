package com.ukiyu.blog003;

public class Rectangle {
	private final double x;
	private final double y;
	private final double height;
	private final double width;

	private Rectangle(double x, double y, double height, double width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	static public Rectangle of(double x, double y, double height, double width) {
		return new Rectangle(x, y, height, width);
	}

	public Rectangle addXY(double x, double y) {
		return of(this.x + x, this.y + y, this.height, this.width);
	}

	@Override
	public String toString() {
		return "Rectangle (x, y) = ( " + x + ", " + y + ") , (height, width) = ( " + height + ", " + width + ")";
	}

}
