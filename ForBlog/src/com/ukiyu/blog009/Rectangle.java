package com.ukiyu.blog009;

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

	public Rectangle plus(Position other) {
		return of(position.plus(other), size);
	}

	public Rectangle plus(Size other) {
		return of(position, size.plus(other));
	}

	static public class Scaling {
		public enum Base{
			TOP_LEFT(Size.Rate.ZERO),
			TOP(Size.Rate.of(0, 0.5)),
			TOP_RIGHT(Size.Rate.of(0, 1)),
			LEFT(Size.Rate.of(0.5, 0)),
			CENTER(Size.Rate.HALF),
			RIGHT(Size.Rate.of(0.5, 1)),
			BOTTOM_LEFT(Size.Rate.of(1, 0)),
			BOTTOM(Size.Rate.of(1, 0.5)),
			BOTTOM_RIGHT(Size.Rate.SAME);

			private final Size.Rate rate;

			private Base(Size.Rate rate){
				this.rate = rate;
			}

			private Position adjust(Position current, Size difference) {
				return current.minus(difference.multiply(rate).toPosition());
			}
		}

		private final Size.Rate rate;
		private final Base base;

		private Scaling(Size.Rate rate, Base base) {
			this.rate = rate;
			this.base = base;
		}

		static public Scaling of(Size.Rate rate, Base base) {
			return new Scaling(rate, base);
		}

		static public Scaling of(Size.Rate rate) {
			return new Scaling(rate, Base.TOP_LEFT);
		}

		public Rectangle apply(Position position, Size size) {
			Size multipliedSize = size.multiply(rate);
			Size differenceSize = multipliedSize.minus(size);

			return Rectangle.of(base.adjust(position, differenceSize), multipliedSize);
		}

	}

	public Rectangle resize(Size.Rate rate) {
		return resize(Scaling.of(rate));
	}

	public Rectangle resize(Scaling scaling) {
		return scaling.apply(position, size);
	}

	@Override
	public String toString() {
		return "Rectangle " + position + ", " + size;
	}

}
