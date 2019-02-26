/**
 * Lab 6
 *
 * Class representing an equilateral Triangle.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class EquilateralTriangle extends Polygon
{
    /**
     * Lenght of the sides of the equilateral triangle.
     */
    private double sideLength;

	/**
	 * Constructor for the equilateral triangle. Sets sideLength member variable and sets
	 * all side length in Polygon sidelengths array.
	 *
	 * @param sidelength The length of the triangle sides.
	 */
	public EquilateralTriangle(String id, double sideLength)
	{
		//Calling the super constructor
		super(id);
		//setting the local variable
		this.sideLength=sideLength;
		//adding the side lengths to the arraylist from polygon
		sideLengths.add(sideLength);
		sideLengths.add(sideLength);
		sideLengths.add(sideLength);
		
		// TODO: complete this...
	}

	/**
	 * Gets the area of the triangle.
	 *
	 * @return The area of the triangle (b*h/2 = sidelength*sidelength*root(3)/4)
	 */
	@Override
	public double getArea()
	{
		//calcuating the area
		return Math.pow(sideLength, 2)*(Math.sqrt(3.0)/4);
		// TODO: complete this...
	}
	
	/**
	 * Gets the shape type of the triangle.
	 *
	 * @return The string "EquilateralTriangle"
	 */
	@Override
	public String getShapeType()
	{
		return "EquilateralTriangle";
		// TODO: complete this...
	}
}
