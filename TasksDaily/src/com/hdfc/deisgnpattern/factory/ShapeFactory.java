package com.hdfc.deisgnpattern.factory;

public class ShapeFactory {
	public Shape getShapeObject(String shapeType) {

		Shape shapeObject = null;

		String key = shapeType.toUpperCase();
		switch (key) {

		case "CIRCLE":
			shapeObject = new Circle();

			break;

		case "SQUARE":

			shapeObject = new Square();

			break;

		case "RECTANGLE":

			shapeObject = new Rectangle();

			break;

		default:

			shapeObject = null;

		}

		return shapeObject;

	}

}
