package com.hcl.factory;

import java.util.Scanner;

public class FactoryRunner {

	public static void main(String[] args) {

		ShapeFactory factory = new ShapeFactory();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter What type of Shape  You want to draw  ?");

		String shapeType = scanner.next(); 

		Shape shapeObject = factory.getShapeObject(shapeType);

		if (shapeObject != null) {
			shapeObject.drawShape();
		}

		else {

			System.err.println("Invalid Shape not available in system");

		}

	}

}
