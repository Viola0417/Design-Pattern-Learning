package factory;

/*
 * In Factory pattern, we create object without exposing the creation logic to client.
 * Client use the same common interface to create new type of object.
 * We use factory method to create and return instances, hiding the details of class modules from user.
 */

public class test {
	public static void main(String[] args) {
		/*
		 *without factory
		 *
		shapeInterface myCircle = new circle();
		myCircle.draw();
		
		shapeInterface mySquare = new square();
		mySquare.draw();
		*/
		
		
		/*with factory, separate implementation with client
		 * create object by case
		 *  
		shapeFactory myShapeFactory = new shapeFactory();
		shapeInterface myCircle = myShapeFactory.getShape("circleShape");
		if (myCircle != null) {
			myCircle.draw();
		}
		*/
		
		
		/*
		 * with factory, create object by className
		 * avoid adding too much if case
		 * 
		shapeFactory myShapeFactory = new shapeFactory();
		shapeInterface myCircle = myShapeFactory.getShapeByClass("factory.circle");
		myCircle.draw();
		*/
		
		
		//with factory, create object by key mapping to className
		shapeFactory myShapeFactory = new shapeFactory();
		shapeInterface myShape = myShapeFactory.getShapeByClassKey("circle");
		myShape.draw();
		
		myShape = myShapeFactory.getShapeByClassKey("rectangle");
		myShape.draw();
	}
}
