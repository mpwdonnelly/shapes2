package shapes_mdonnelly3;

import java.util.Scanner;

public class ShapesTest {

	public static void main(String[] args) {
		
		float length = 0.0f;
		float width = 0.0f;
		float height = 0.0f;
		float radius = 0.0f;
		String errorMessage = "Value must be a value greater than zero";
		
		// print out a message to acknowledge that the program is running
		System.out.println("Shapes Tester v1.0 running");
		
		// set up scanner object for user inputs
		Scanner scanner = new Scanner(System.in);
		
		// Now get values for the dimensions of each shape
		// start with the cuboid
		// validate each input to make sure it is a positive value
		
		// TODO check scanner to see if it throws an exception for the wrong kind of input (letters etc)
		// TODO put these into a single function and feed in different vars instead of repeating code
		
		System.out.println("Enter the dimensions for a cuboid:");
		while (length <= 0) {
			System.out.print("Length = ");
			length = scanner.nextFloat();
			if (length <= 0) System.out.println(errorMessage);
		}
		
		while (width <= 0) {
			System.out.print("Width = ");
			width = scanner.nextFloat();
			if (width <= 0) System.out.println(errorMessage);
		}
		
		while (height <= 0) {
			System.out.print("Height = ");
			height = scanner.nextFloat();
			if (height <= 0) System.out.println(errorMessage);
		}
		
		Cuboid cuboid = new Cuboid(length, width, height);
		cuboid.render();
		
		// Now do the cylinder
		height = 0.0f;
		System.out.println("Enter the dimensions for a cylinder:");
		while (radius <= 0) {
			System.out.print("Radius = ");
			radius = scanner.nextFloat();
			if (radius <= 0) System.out.println(errorMessage);
		}
		
		while (height <= 0) {
			System.out.print("Height = ");
			height = scanner.nextFloat();
			if (height <= 0) System.out.println(errorMessage);
		}
		
		Cylinder cylinder = new Cylinder(radius, height);
		cylinder.render();
		
		// Now do the sphere
		radius = 0.0f;
		System.out.println("Enter the radius for a sphere:");
		while (radius <= 0) {
			System.out.print("Radius = ");
			radius = scanner.nextFloat();
			if (radius <= 0) System.out.println(errorMessage);
		}
		Sphere sphere = new Sphere(radius);
		sphere.render();
		
		// print out a message to acknowledge program has been terminated
		System.out.println("All Done");
	}

}
