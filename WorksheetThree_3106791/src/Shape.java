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

}
