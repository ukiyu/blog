package com.ukiyu.blog002;

public class Rectangle {
	private double x;
	private double y;
	private double height;
	private double width;

	private Rectangle(double x, double y, double height, double width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	static public Rectangle of(double x, double y, double height, double width) {
		return new Rectangle(x, y, height, width);
	}

	public void addX(double x) {
		this.x += x;
	}

	public void addY(double y) {
		this.y += y;
	}

	@Override
	public String toString() {
		return "Rectangle (x, y) = ( " + x + ", " + y + ") , (height, width) = ( " + height + ", " + width + ")";
	}

}
