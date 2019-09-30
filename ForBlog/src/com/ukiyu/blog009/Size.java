package com.ukiyu.blog009;

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

	public Size minus(Size other) {
		return of(height - other.height, width - other.width);
	}

	public Position toPosition(Position offset) {
		return Position.of(height, width).plus(offset);
	}

	public Position toPosition() {
		return toPosition(Position.of(0, 0));
	}

	static public class Rate {
		private final double x;
		private final double y;

		static public final Rate ZERO = of(0);
		static public final Rate HALF = of(0.5);
		static public final Rate SAME = of(1);
		static public final Rate DOUBLE = of(2);

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
