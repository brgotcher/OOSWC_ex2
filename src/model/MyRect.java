package model;

public class MyRect extends MyShape {

    private double width;
    private double height;

    public MyRect(float x, float y, double height, double width) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public MyRect() {
        this(0f, 0f, 0, 0);
    }

    public MyRect(double width, double height) {
        this(0f, 0f, width, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "MyRect[(" + getLocation() + ") w=" + width + " h=" + height + "]";
    }
}
