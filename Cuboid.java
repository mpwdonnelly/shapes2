package shapes_mdonnelly3;

import javax.swing.JOptionPane;

public class Cuboid extends Shape {
	
	// declare basic vars.
	// all cuboids have 3 dimensions: length, width, height
    private float width = 0.0f;
    private float height = 0.0f;
    private float length = 0.0f;
    
    
    // constructor
    public Cuboid(float length, float width, float height) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
	}

	// now put in the getters and setters for each
    
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		// value that is passed should already be validated
		this.width = width;
	
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		// value that is passed should already be validated
		this.height = height;
	
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		// value that is passed should already be validated
		this.length = length;
	}

	@Override
	public float surfaceArea() {
		float sA = (2 * (length * width)) + (2 * (height * width)) + (2 * (length * height));
		return sA;
	}

	public float volume() {
		float vol = length * height * width;
		return vol;
	}

	public void render() {
		String message = "Shape: CUBOID\n\n";
		message += "Dimensions: \n";
		message += "length = " + length + " units\n";
		message += "width = " + width + " units\n";
		message += "height = " + height + " units\n\n";
		message += "Surface Area = " + surfaceArea() + " units^2\n";
		message += "Volume = " + volume() + " units^3\n";
		
		JOptionPane.showMessageDialog(null, message);
		
	}
	

	

}
