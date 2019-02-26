
public class Rectangle extends Polygon
{
	public double height;
	public double width;

	public Rectangle(String id, double width, double height) 
	{
		super(id);
		this.height=height;
		this.width=width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea()
	{
		// TODO Auto-generated method stub
		return width*height;
	}

	/*public double getPerimeter()
	{
		return (width*2)+(height*2);
		
	}
	*/
	@Override
	public String getShapeType() 
	{
		// TODO Auto-generated method stub
		return "Rectangle";
	}

}
