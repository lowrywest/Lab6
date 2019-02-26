
public class Rectangle extends Polygon
{
	//global variables used throughout the class
	public double height;
	public double width;

	public Rectangle(String id, double width, double height) 
	{
		//calling the super constructor
		super(id);
		//setting the variables
		this.height=height;
		this.width=width;
		//putting the lengths in the ArrayList
		sideLengths.add(width);
		sideLengths.add(width);
		sideLengths.add(height);
		sideLengths.add(height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea()
	{
		//calcuating the area
		// TODO Auto-generated method stub
		return width*height;
	}

	
	@Override
	public String getShapeType() 
	{
		// TODO Auto-generated method stub
		return "Rectangle";
	}

}
