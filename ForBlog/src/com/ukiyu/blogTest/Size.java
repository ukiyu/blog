package com.ukiyu.blogTest;

public class Size {
	private final Point size;

	private Size(Point size) {
		this.size = size;
	}

	static public Size of(Point size) {
		return new Size(size);
	}

	public Size plus(Size other) {
		return of(size.plus(other.size));
	}

	public Size resize(Rate rate) {
		return of(rate.apply(size));
	}

	static class Rate{
		private final double rate;

		private Rate(double rate) {
			this.rate = rate;
		}

		static public Rate of(double rate) {
			return new Rate(rate);
		}

		public Point apply(Point point) {
			return point.multiply(Point.of(rate, rate));
		}
	}
}
