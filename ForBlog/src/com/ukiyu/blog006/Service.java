package com.ukiyu.blog006;

public class Service {

	public static void main(String[] args) {
		System.out.println("Ver.006 Start");

		Position position = Position.of(100, 100);
		Size size = Size.of(20, 30);
		Rectangle rectangle = Rectangle.of(position, size);
		System.out.println(rectangle);

		Position distance = Position.of(10, 20);
		Rectangle movedRactangle = rectangle.plus(distance);

		System.out.println(movedRactangle);
	}

}
