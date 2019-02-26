
public class Square extends Rectangle
{
	public double size;
	
	public Square(String id,double size)
	{
		super(id, size/2, size/2);
		this.size=size;
		// TODO Auto-generated constructor stub
	}
	
	public double getArea()
	{
		// TODO Auto-generated method stub
		return Math.pow(size, 2);
	}

	public double getPerimeter()
	{
		return size*4;
		
	}
	public String getShapeType()
	{
		return "Square";
		
	}

}
