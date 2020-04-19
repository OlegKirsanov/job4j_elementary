package ru.job4j.strategy;

public class Paint {
    Shape shape;

    public void setShape (Shape shape) {
        this.shape = shape;
    }

    public String drawShape() {
        return shape.draw();
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.setShape(new Triangle());
        System.out.println(paint.drawShape());
        paint.setShape(new Square());
        System.out.println(paint.drawShape());
    }
}
