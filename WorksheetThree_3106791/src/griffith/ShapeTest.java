package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ShapeTest {
		

    @Test
    void testIntegration() {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Add instances of each subclass to the shapes list
        shapes.add(new Shape.Circle("Circle", 3.5));
        shapes.add(new Shape.Circle("Circle", 5.0));
        shapes.add(new Shape.Rhombus("Rhombus", 4.0, Math.PI / 3));
        shapes.add(new Shape.Rhombus("Rhombus", 6.0, Math.PI / 4));
        shapes.add(new Shape.RightAngledTriangle("Triangle", 3.0, 4.0));
        shapes.add(new Shape.RightAngledTriangle("Triangle", 5.0, 12.0));

        // Assertions for Circle
        assertEquals(38.48451000647496, shapes.get(0).area());
        assertEquals(21.991148575128552, shapes.get(0).perimeter());
        assertEquals("Shape: Circle, Radius: 3.5", shapes.get(0).toString());

        assertEquals(78.53981633974483, shapes.get(1).area());
        assertEquals(31.41592653589793, shapes.get(1).perimeter());
        assertEquals("Shape: Circle, Radius: 5.0", shapes.get(1).toString());

        // Assertions for Rhombus
        assertEquals(13.856406460551018, shapes.get(2).area());
        assertEquals(16.0, shapes.get(2).perimeter());
        assertEquals("Shape: Rhombus, Side: 4.0, Angle: 1.0471975511965976", shapes.get(2).toString());

        assertEquals(25.45584412271571, shapes.get(3).area());
        assertEquals(24.0, shapes.get(3).perimeter());
        assertEquals("Shape: Rhombus, Side: 6.0, Angle: 0.7853981633974483", shapes.get(3).toString());

        // Assertions for RightAngledTriangle
        assertEquals(6.0, shapes.get(4).area());
        assertEquals(12.0, shapes.get(4).perimeter());
        assertEquals("Shape: Triangle, Base: 3.0, Height: 4.0, Hypotenuse: 5.0", shapes.get(4).toString());

        assertEquals(30.0, shapes.get(5).area());
        assertEquals(30.0 , shapes.get(5).perimeter());
        assertEquals("Shape: Triangle, Base: 5.0, Height: 12.0, Hypotenuse: 13.0", shapes.get(5).toString());
    }
}
