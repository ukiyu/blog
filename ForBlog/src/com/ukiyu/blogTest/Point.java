package com.ukiyu.blogTest;

public class Point {
	private final double x;
	private final double y;

	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	static public Point of(double x, double y) {
		return new Point(x, y);
	}

	public Point plus(Point other) {
		return of(x + other.x, y + other.y);
	}

	public Point multiply(Point other) {
		return of(x * other.x, y * other.y);
	}
}
