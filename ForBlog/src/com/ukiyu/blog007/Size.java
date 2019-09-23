package com.ukiyu.blog007;

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

	public Size multiply(double x, double y) {
		return of(height * x, width * y);
	}

	@Override
	public String toString() {
		return "(height, width) = (" + height + ", " + width + ")";
	}
}
