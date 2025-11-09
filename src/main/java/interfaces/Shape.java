package main.java;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
