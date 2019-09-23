package com.ukiyu.blog001;

public class Service {

	public static void main(String[] args) {
		System.out.println("Ver.001 Start");

		// 座標(100, 100)に存在する20x30の大きさの四角形
		Rectangle rectangle = new Rectangle(100, 100, 20, 30);
		System.out.println(rectangle);

		// x方向に10動かす。
		double x = rectangle.getX();
		x = x + 10;
		rectangle.setX(x);

		// y方向に20動かす。
		double y = rectangle.getY();
		y = y + 20;
		rectangle.setY(y);

		System.out.println(rectangle);
	}

}
