
public class Rectangle extends Polygon
{
	public double height;
	public double width;

	public Rectangle(String id, double width, double height) 
	{
		super(id);
		this.height=height;
		this.width=width;
		sideLengths.add(width);
		sideLengths.add(width);
		sideLengths.add(height);
		sideLengths.add(height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea()
	{
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
