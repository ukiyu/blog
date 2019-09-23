package com.ukiyu.blog006;

public class Size {
	private final double height;
	private final double width;

	private Size(double height, double width) {
		this.height = height;
		this.width = width;
	}

	static public Size of(double height, double width) {
		return new Size(height, width);
	}

	public Size plus(Size other) {
		return of(height + other.height, width + other.width);
	}

	@Override
	public String toString() {
		return "(height, width) = (" + height + ", " + width + ")";
	}
}
