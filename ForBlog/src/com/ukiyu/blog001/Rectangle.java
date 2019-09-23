package com.ukiyu.blog001;

public class Rectangle {
	private double x;
	private double y;
	private double height;
	private double width;

	public Rectangle(double x, double y, double height, double width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Rectangle (x, y) = ( " + x + ", " + y + ") , (height, width) = ( " + height + ", " + width + ")";
	}

}
