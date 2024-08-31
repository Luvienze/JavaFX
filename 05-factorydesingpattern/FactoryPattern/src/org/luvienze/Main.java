package org.luvienze;

public class Main {
    public static void main(String[] args) {
        Shape rect = ShapeFactory.getRectShape();
        Shape square = ShapeFactory.getSquareShape();
        Shape circle = ShapeFactory.getCircleShape();

        rect.draw();
    }
}
