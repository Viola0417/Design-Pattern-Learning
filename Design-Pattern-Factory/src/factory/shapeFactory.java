package factory;

import java.util.Map;

public class shapeFactory {
	//create object according to shape
	public shapeInterface getShape(String key) {
		// If we add a new class, we need to add more if case, not convenient
		if ("circleShape".equalsIgnoreCase(key)) {
			return new circle();
		} else if ("squareShape".equalsIgnoreCase(key)) {
			return new square();
		}
		return null;
	}
	
	/*
	 * ---------------in following methods---------------
	 * when we need new class, we can only implement it in the class without changing factory
	 */
	
	
	//create object according to class
	public shapeInterface getShapeByClass(String className) {
		try {
			shapeInterface myShapeInterface = (shapeInterface) Class.forName(className).newInstance();
			return myShapeInterface;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//create object according to key mapping with className
	//no need to enter the complete class name, just its alias
	public shapeInterface getShapeByClassKey(String key) {
		try {
			Map<String, String> map = new propertiesReader().getProperties();
			shapeInterface myShapeInterface = (shapeInterface) Class.forName(map.get(key)).newInstance();
			return myShapeInterface;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
 