package shapes_mdonnelly3;

abstract class Shape {
	
	// set up our superclass Shape as an abstract class
	// make sure to all subclasses will have three methods
	// surfaceArea, volume, and one for rendering an output window
	
	abstract float surfaceArea();
	
	abstract float volume();
	
	abstract void render();
	
}
