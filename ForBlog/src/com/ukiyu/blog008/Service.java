package com.ukiyu.blog008;

public class Service {

	public static void main(String[] args) {
		System.out.println("Ver.008 Start");

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
	}

}
