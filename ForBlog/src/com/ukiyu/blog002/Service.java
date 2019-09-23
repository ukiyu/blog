package com.ukiyu.blog002;

public class Service {

	public static void main(String[] args) {
		System.out.println("Ver.002 Start");

		// 座標(100, 100)に存在する20x30の大きさの四角形
		Rectangle rectangle = Rectangle.of(100, 100, 20, 30);
		System.out.println(rectangle);

		// x方向に10動かす。
		rectangle.addX(10);

		// y方向に20動かす。
		rectangle.addY(20);

		System.out.println(rectangle);
	}

}
