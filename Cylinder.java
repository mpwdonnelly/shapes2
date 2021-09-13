package shapes_mdonnelly3;

import javax.swing.JOptionPane;

public class Cylinder extends Shape {

	// lets start by specifying PI as a constant to four places
	final float PI = 3.1416f;
	
	// declare basic vars.
	// all cylinders have 2 dimensions: radius and height
	// could also call 'height' 'length' but we think of them as upright,
	// with one circular face flat on an impaginary table
    private float radius = 0.0f;
    private float height = 0.0f;
    
    
    // constructor
	public Cylinder(float radius, float height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		// value that is passed should already be validated
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		// value that is passed should already be validated
		this.height = height;
	}

	@Override
	float surfaceArea() {
		// Surface area of a cylinder:
		// equals to the area of the two circular faces
		// plus the surface area of the side
		// which is circumference * height
		float circFaceArea = (radius * radius * PI);   	// PI * r^2
		float circumference = radius * 2 * PI; 			// (2 * rad) * PI
		float sideArea = circumference * height;		
		float sA = (2 * circFaceArea) + sideArea;
		return sA;
	}

	float volume() {
		// volume is the area of the circ face * height
		// much simpler than the surface area
		float vol = (radius * radius * PI) * height;   
		return vol;
	}

	void render() {
		String message = "Shape: CYLINDER\n\n";
		message += "Dimensions: \n";
		message += "radius = " + radius + " units\n";
		message += "height = " + height + " units\n\n";
		message += "Surface Area = " + surfaceArea() + " units^2\n";
		message += "Volume = " + volume() + " units^3\n";
		
		JOptionPane.showMessageDialog(null, message);

	}

}
