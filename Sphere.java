package shapes_mdonnelly3;

import javax.swing.JOptionPane;

public class Sphere extends Shape {
	
	// lets start by specifying PI as a constant to four places
	final float PI = 3.1416f;
	
	// for a sphere, there is only a single dimension of concern
	// the radius of the sphere
    private float radius = 0.0f;
	
	// constructor
	public Sphere(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		// value passed in here should have been validated to be greater than zero
		this.radius = radius;
	}

	@Override
	float surfaceArea() {
		// Surface area (sA)  of a sphere equals 4 * pi * radius^2. 
		float sA = 4 * PI * (float)Math.pow(radius, 2);
		return sA;
	}

	float volume() {
		// volume (vol) of a sphere equals four-thirds * pi * radius^3
		float vol = 1.333f * PI * (float)Math.pow(radius, 3);
		return vol;
	}

	void render() {
	    String message = "Shape: SPHERE\n\n";
		message += "Dimensions: \n";
		message += "radius = " + radius + " units\n\n";
		message += "Surface Area = " + surfaceArea() + " units^2\n";
		message += "Volume = " + volume() + " units^3\n";
		
		JOptionPane.showMessageDialog(null, message);

	}

}
