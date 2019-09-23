package com.ukiyu.blog009;

import com.ukiyu.blog009.Rectangle.Scaling;

public class Service {

	public static void main(String[] args) {
		System.out.println("Ver.009 Start");

		Position position = Position.of(100, 100);
		Size size = Size.of(20, 30);
		Rectangle rectangle = Rectangle.of(position, size);
		System.out.println(rectangle);

		Position distance = Position.of(10, 20);
		Rectangle movedRactangle = rectangle.plus(distance);

		System.out.println(movedRactangle);

		Size.Rate rate = Size.Rate.of(1.5);
		Rectangle resizedRactangle = rectangle.resize(rate);

		System.out.println(resizedRactangle);

		System.out.println("");
		Rectangle resizedTop = rectangle.resize(Scaling.of(rate, Scaling.Base.TOP));
		System.out.println(resizedTop);

		Rectangle resizedTopRight = rectangle.resize(Scaling.of(rate, Scaling.Base.TOP_RIGHT));
		System.out.println(resizedTopRight);


		Rectangle resizedLeft = rectangle.resize(Scaling.of(rate, Scaling.Base.LEFT));
		System.out.println(resizedLeft);

		Rectangle resizedCenter = rectangle.resize(Scaling.of(rate, Scaling.Base.CENTER));
		System.out.println(resizedCenter);

		Rectangle resizedRight = rectangle.resize(Scaling.of(rate, Scaling.Base.RIGHT));
		System.out.println(resizedRight);


		Rectangle resizedBottomLeft = rectangle.resize(Scaling.of(rate, Scaling.Base.BOTTOM_LEFT));
		System.out.println(resizedBottomLeft);

		Rectangle resizedBottom = rectangle.resize(Scaling.of(rate, Scaling.Base.BOTTOM));
		System.out.println(resizedBottom);

		Rectangle resizedBottomRight = rectangle.resize(Scaling.of(rate, Scaling.Base.BOTTOM_RIGHT));
		System.out.println(resizedBottomRight);
	}

}
