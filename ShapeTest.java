import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for shapes and their comparators.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeTest
{
	//==================================================================================================================
	// Basic Shape Testing:
	//==================================================================================================================
    /**
     * Tests for the square class.
     */
	@Test
	public void SquareTest()
	{
		Shape sqr = new Square("Square1", 3.0);
		Assert.assertEquals("Square area incorrect.", 9.0, sqr.getArea(), 0.0001);
		Assert.assertEquals("Square perimeter incorrect.", 12.0, sqr.getPerimeter(), 0.0001);
		Assert.assertEquals("Square type incorrect.", "Square", sqr.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Square1", sqr.getId());
	}

	/**
     * Tests for the rectangle class.
     */
	@Test
	public void RectangleTest()
	{
		Shape rect = new Rectangle("Rectangle1", 4.0, 5.0);
		Assert.assertEquals("Rectangle area incorrect.", 20.0, rect.getArea(), 0.0001);
		Assert.assertEquals("Rectangle perimeter incorrect.", 18.0, rect.getPerimeter(), 0.0001);
		Assert.assertEquals("Rectangle type incorrect.", "Rectangle", rect.getShapeType());
		Assert.assertEquals("Rectangle ID incorrect.", "Rectangle1", rect.getId());
		// TODO: complete this...
	}

	/**
     * Tests for the EquilateralTriangle class.
     */
	@Test
	public void TriangleTest()
	{
		Shape tri = new EquilateralTriangle("Triangle1", 3.0);
		Assert.assertEquals("Triangle area incorrect.", Math.pow(3.0, 2)*(Math.sqrt(3.0)/4), tri.getArea(), 0.0001);
		Assert.assertEquals("Triangle perimeter incorrect.", 9.0, tri.getPerimeter(), 0.0001);
		Assert.assertEquals("Triangle type incorrect.", "EquilateralTriangle", tri.getShapeType());
		Assert.assertEquals("Triangle ID incorrect.", "Triangle1", tri.getId());
		// TODO: complete this...
	}

	/**
     * Tests for the trapezoid class. Also test that IDs are done correctly.
     */
	@Test
	public void TrapezoidTest()
	{
		Shape trap= new Trapezoid("Trapezoid1", 3.0, 4.0, 5.0, 6.0);
		double a = 3.0;
		double b = 4.0;
		double c = 5.0;
		double d = 6.0;
		double e = (a + b) / 2;
		double f = Math.pow(b - a, 2) + Math.pow(c, 2) - Math.pow(d, 2);
		double g = 2 * c * (b - a);

		// Calculate:
		Assert.assertEquals("Trapezoid area incorrect.", e * c * Math.sqrt(1 - Math.pow(f/g, 2)), trap.getArea(), 0.0001);
		Assert.assertEquals("Trapezoid perimeter incorrect.", 18.0, trap.getPerimeter(), 0.0001);
		Assert.assertEquals("Trapezoid type incorrect.", "Trapezoid", trap.getShapeType());
		Assert.assertEquals("TrapezoidID incorrect.", "Trapezoid1", trap.getId());
		
		
		Shape traps= new Trapezoid("Trapezoid2", 6.0, 4.0, 9.0, 7.0);
		double a1 = 6.0;
		double b1 = 4.0;
		double c1 = 9.0;
		double d1 = 7.0;
		double e1 = (a1 + b1) / 2;
		double f1 = Math.pow(b1 - a1, 2) + Math.pow(c1, 2) - Math.pow(d1, 2);
		double g1 = 2 * c1 * (b1 - a1);

		// Calculate:
		Assert.assertEquals("Trapezoid area incorrect.", e1 * c1 * Math.sqrt(1 - Math.pow(f1/g1, 2)), traps.getArea(), 0.0001);
		Assert.assertEquals("Trapezoid perimeter incorrect.", 26.0, traps.getPerimeter(), 0.0001);
		Assert.assertEquals("Trapezoid type incorrect.", "Trapezoid", traps.getShapeType());
		Assert.assertEquals("Trapezoid ID incorrect.", "Trapezoid2", traps.getId());
		// TODO: complete this...
	}

	/**
     * Tests for the ellipse class. Also test that IDs are done correctly.
     */
	@Test
	public void EllipseTest()
	{
		Shape circ = new Ellipse("Ellipse1", 3.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(3, 2) + Math.pow(3, 2)) / 2),
				circ.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse1", circ.getId());

		Shape circs = new Ellipse("Ellipse2", 5.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3*5, circs.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(5.0, 2) + Math.pow(3.0, 2)) / 2),
				circs.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circs.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse2", circs.getId());
	}

	/**
     * Tests for the circle class. Also test that IDs are done correctly.
     */
	@Test
	public void CircleTest()
	{
		Shape circ = new Circle("Circle1", 3.0);
		Assert.assertEquals("Circle area incorrect.", Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals("Circle perimeter incorrect.",2*Math.PI*3.0,circ.getPerimeter(),0.0001);
		Assert.assertEquals("Circle type incorrect.", "Circle",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Circle1", circ.getId());

		Shape circs = new Circle("Circle2", 5.0);
		Assert.assertEquals("Circle area incorrect.", Math.PI*5.0*5.0, circs.getArea(),0.0001);
		Assert.assertEquals("Circle perimeter incorrect.",2*Math.PI*5.0,circs.getPerimeter(),0.0001);
		Assert.assertEquals("Circle type incorrect.", "Circle",circs.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Circle2", circs.getId());
		// TODO: complete this...
	}

	/**
	 * Tests for Shape's toString().
	 */
	@Test
	public void ShapeToStringTest()
	{
		Shape rect= new Rectangle("Rectangle2", 10.0, 7.0);
		String output= String.format(String.format("%s:\t ID = %s\t area = %.3f\t perimeter = %.3f", rect.getShapeType(),
				rect.getId(), rect.getArea(), rect.getPerimeter()));
		Assert.assertEquals( "Shape to String incorrect",output,rect.toString() );
		// TODO: complete this...
	}

	//==================================================================================================================
	// Comparisons:
	//==================================================================================================================
	/**
     * Tests for the Shape Area Comparator class.
     */
	@Test
	public void CompareAreaTest()
	{
	    // Test equals:
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapeAreaComparator sc = new ShapeAreaComparator();
		Assert.assertEquals("ShapeAreaComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapeAreaComparator should find shapes equal.", sc.equals(rect, sqr));

		// Test equal perimeter, different area:
        Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
	}

	/**
     * Tests for the Shape Perimter Comparator class.
     */
	@Test
	public void ComparePerimeterTest()
	{
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapePerimeterComparator sc = new ShapePerimeterComparator();
		Assert.assertEquals("ShapePerimeterComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapePerimeterComparator should find shapes equal.", sc.equals(rect, sqr));

		// Test diffrent perimeter, equal area:
        Shape rect2 = new Rectangle("R2", 5.0, 3.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", -1, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect2));
        Assert.assertFalse("ShapePerimeterComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapePerimeterComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
		// TODO: complete this...
	}

	/**
	 * Tests the natural ordering of shapes (compareTo in shape)
	 */
	@Test
    public void NaturalCompareTest()
    {
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		Assert.assertEquals("compareTo should find shapes equal.", 0, rect.compareTo(sqr));

		// Test diffrent perimeter, equal area:
        Shape rect2 = new Rectangle("R2", 5.0, 3.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("compareTo gave incorrect ordering.", -1, rect2.compareTo(sqr2));
        Assert.assertEquals("compareTo gave incorrect ordering.",1, sqr2.compareTo(rect2));
     // Test equal perimeter, different area:
        Shape rect3 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr3 = new Square("S2", 5.0);
        Assert.assertEquals("compareTo gave incorrect ordering.", -1, rect3.compareTo(sqr3));
        Assert.assertEquals("compareTo gave incorrect ordering.", 1, sqr3.compareTo(rect3));
       
        // Test unequal perimeter and area:
        Assert.assertEquals("compareTo gave incorrect ordering.", 1, sqr2.compareTo(rect));
        Assert.assertEquals("compareTo gave incorrect ordering.", -1, rect.compareTo(sqr2));
		
		
		
		// TODO: complete this...
    }
}
