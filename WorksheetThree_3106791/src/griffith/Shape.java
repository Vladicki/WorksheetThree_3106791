package griffith;

public abstract class Shape {

    private String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract method to calculate area
    public abstract double area();

    // Abstract method to calculate perimeter
    public abstract double perimeter();

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // toString method
    @Override
    public String toString() {
        return "Shape: " + name;
    }
    
    // Define Circle as a static inner class
    public static class Circle extends Shape {
        private double radius;

        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return super.toString() + ", Radius: " + radius;
        }
    }

    // Define Rhombus as a static inner class
    public static class Rhombus extends Shape {
        private double side;
        private double angle; // In radians

        public Rhombus(String name, double side, double angle) {
            super(name);
            this.side = side;
            this.angle = angle;
        }

        @Override
        public double area() {
            return side * side * Math.sin(angle);
        }

        @Override
        public double perimeter() {
            return 4 * side;
        }

        @Override
        public String toString() {
            return super.toString() + ", Side: " + side + ", Angle: " + angle;
        }
    }

    // Define RightAngledTriangle as a static inner class
    public static class RightAngledTriangle extends Shape {
        private double base;
        private double height;
        private double hypotenuse;

        public RightAngledTriangle(String name, double base, double height) {
            super(name);
            this.base = base;
            this.height = height;
            this.hypotenuse = Math.sqrt(base * base + height * height);
        }

        @Override
        public double area() {
            return 0.5 * base * height;
        }

        @Override
        public double perimeter() {
            return base + height + hypotenuse;
        }

        @Override
        public String toString() {
            return super.toString() + ", Base: " + base + ", Height: " + height + ", Hypotenuse: " + hypotenuse;
        }
    }
}
