import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class IntegrationTest {

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
        assertEquals(38.48451000647496, shapes.get(0).area(), 0.0);
        assertEquals(21.991148575128552, shapes.get(0).perimeter(), 0.0);
        assertEquals("Shape: Circle, Radius: 3.5", shapes.get(0).toString());

        assertEquals(78.53981633974483, shapes.get(1).area(), 0.0);
        assertEquals(31.41592653589793, shapes.get(1).perimeter(), 0.0);
        assertEquals("Shape: Circle, Radius: 5.0", shapes.get(1).toString());

        // Assertions for Rhombus
        assertEquals(6.928203230275509, shapes.get(2).area(), 0.0);
        assertEquals(16.0, shapes.get(2).perimeter(), 0.0);
        assertEquals("Shape: Rhombus, Side: 4.0, Angle: 1.0471975511965976", shapes.get(2).toString());

        assertEquals(18.0, shapes.get(3).area(), 0.0);
        assertEquals(24.0, shapes.get(3).perimeter(), 0.0);
        assertEquals("Shape: Rhombus, Side: 6.0, Angle: 0.7853981633974483", shapes.get(3).toString());

        // Assertions for RightAngledTriangle
        assertEquals(6.0, shapes.get(4).area(), 0.0);
        assertEquals(12.0, shapes.get(4).perimeter(), 0.0);
        assertEquals("Shape: Triangle, Base: 3.0, Height: 4.0, Hypotenuse: 5.0", shapes.get(4).toString());

        assertEquals(30.0, shapes.get(5).area(), 0.0);
        assertEquals(30.0 + 5.0 + 12.0, shapes.get(5).perimeter(), 0.0);
        assertEquals("Shape: Triangle, Base: 5.0, Height: 12.0, Hypotenuse: 13.0", shapes.get(5).toString());
    }
}
