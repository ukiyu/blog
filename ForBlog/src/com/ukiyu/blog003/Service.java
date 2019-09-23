package com.ukiyu.blog003;

public class Service {

	public static void main(String[] args) {
		System.out.println("Ver.003 Start");

		// 座標(100, 100)に存在する20x30の大きさの四角形
		Rectangle rectangle = Rectangle.of(100, 100, 20, 30);
		System.out.println(rectangle);

		// x方向に10, y方向に20動かす。
		rectangle = rectangle.addXY(10, 20);

		System.out.println(rectangle);
	}

}
