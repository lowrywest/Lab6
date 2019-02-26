import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5); 

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 4, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5); 

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		sorter.sortShapes();
		
		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(0), b);
		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(1), d);
		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(3), a);
		// TODO: complete this...
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		Shape s3 = new Rectangle("C", 3.0, 4.0);
		Shape s4 = new Rectangle("D", 16.0, 1.0);
		
		// Add all to sorter:
		sorter.addShape(s1);
		sorter.addShape(s2);
		sorter.addShape(s4);
		sorter.addShape(s3);

		sorter.sortShapes(new ShapeAreaComparator());

		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(0), s2);
		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(1), s3);
		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(2), s1);
		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(3), s4);
		// TODO: complete this...
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{

		ShapeSorter sorter = new ShapeSorter();

		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		Shape s3 = new Rectangle("C", 3.0, 4.0);
		Shape s4 = new Rectangle("D", 16.0, 1.0);
		
		// Add all to sorter:
		sorter.addShape(s1);
		sorter.addShape(s2);
		sorter.addShape(s4);
		sorter.addShape(s3);
		sorter.sortShapes(new ShapePerimeterComparator());

		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(0), s2);
		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(1), s3);
		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(2), s1);
		Assert.assertEquals("Shapes ordered incorrectly...", sorter.shapes.get(3), s4);
		// TODO: complete this...
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		ShapeSorter sorter = new ShapeSorter();
		
		// Create several shapes:
		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		Shape s3 = new Rectangle("C", 3.0, 4.0);
		Shape s4 = new Rectangle("D", 16.0, 1.0);
		Shape s5 = new Rectangle("A", 8.0, 2.0);

		// Add all to sorter:
		sorter.addShape(s1);
		sorter.addShape(s2);
		sorter.addShape(s4);
		sorter.addShape(s3);
		sorter.addShape(s5);
		sorter.sortShapes();
		
		String output="";
		
		for(int i=0; i<sorter.shapes.size(); i++)
		{
			output+=sorter.shapes.get(i).toString()+"\n";
		}
		Assert.assertEquals("toString is incorrect...", output,sorter.toString());
		
		// TODO: complete this...
	}
}
