
public class Square extends Rectangle
{
	public double size;
	
	public Square(String id,double size)
	{
		super(id ,size, size);
		this.size=size;
		// TODO Auto-generated constructor stub
	}
	
	public String getShapeType()
	{
		return "Square";
		
	}

}
