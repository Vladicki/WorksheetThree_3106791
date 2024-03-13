package griffith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    @Test
    void testCircle() {
        Shape.Circle circle = new Shape.Circle("Circle", 5.0);
        assertEquals("Circle", circle.getName());
        assertEquals(78.53981633974483, circle.area(), 0.0001);
        assertEquals(31.41592653589793, circle.perimeter(), 0.0001);
        assertEquals("Shape: Circle, Radius: 5.0", circle.toString());
    }

    @Test
    void testRhombus() {
        Shape.Rhombus rhombus = new Shape.Rhombus("Rhombus", 4.0, Math.PI / 3);
        assertEquals("Rhombus", rhombus.getName());
        assertEquals(6.928203230275509, rhombus.area(), 0.0001);
        assertEquals(16.0, rhombus.perimeter(), 0.0001);
        assertEquals("Shape: Rhombus, Side: 4.0, Angle: 1.0471975511965976", rhombus.toString());
    }

    @Test
    void testRightAngledTriangle() {
        Shape.RightAngledTriangle triangle = new Shape.RightAngledTriangle("Triangle", 3.0, 4.0);
        assertEquals("Triangle", triangle.getName());
        assertEquals(6.0, triangle.area(), 0.0001);
        assertEquals(12.0, triangle.perimeter(), 0.0001);
        assertEquals("Shape: Triangle, Base: 3.0, Height: 4.0, Hypotenuse: 5.0", triangle.toString());
    }
}

