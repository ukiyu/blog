package com.ukiyu.blog008;

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

	static public class Rate {
		private final double x;
		private final double y;

		private Rate(double x, double y) {
			this.x = x;
			this.y = y;
		}

		static public Rate of(double x, double y) {
			return new Rate(x, y);
		}

		static public Rate of(double x) {
			return new Rate(x, x);
		}

		public Size apply(double height, double width) {
			return Size.of(height * x, width * y);
		}
	}

	public Size multiply(Rate rate) {
		return rate.apply(height, width);
	}

	@Override
	public String toString() {
		return "(height, width) = (" + height + ", " + width + ")";
	}
}
