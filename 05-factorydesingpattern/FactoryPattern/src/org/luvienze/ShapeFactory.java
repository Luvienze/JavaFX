package org.luvienze;

public class ShapeFactory {
    public static Rectangle getRectShape(){
        return new Rectangle();
    }

    public static Circle getCircleShape(){
        return new Circle();
    }

    public static Square getSquareShape(){
        return new Square();
    }
}
