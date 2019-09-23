package com.ukiyu.blog005;

public class Service {

	public static void main(String[] args) {
		System.out.println("Ver.005 Start");

		// 座標(100, 100)
		Position position = Position.of(100, 100);
		// 大きさ(20, 30)
		Size size = Size.of(20, 30);
		// 四角形
		Rectangle rectangle = Rectangle.of(position, size);
		System.out.println(rectangle);

		// x方向に10, y方向に20動かす。
		Rectangle addedRectangle = rectangle.addXY(10, 20);

		System.out.println(addedRectangle);
	}

}
