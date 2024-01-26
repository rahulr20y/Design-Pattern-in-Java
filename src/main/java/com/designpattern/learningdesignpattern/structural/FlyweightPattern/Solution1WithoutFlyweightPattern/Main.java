package com.designpattern.learningdesignpattern.structural.FlyweightPattern.Solution1WithoutFlyweightPattern;

class Sprites {

}

class Robot {
    int coordinateX;
    int coordinateY;
    String type;
    Sprites body;// small 2D bitmap(graphic element)

    public Robot(int coordinateX, int coordinateY, String type, Sprites body) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
        this.body = body;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBody(Sprites body) {
        this.body = body;
    }

}

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 5000; i++) {
            Sprites humanoidSprites = new Sprites();
            Robot humanoidRobot = new Robot(x + i, y + i, "HUMANOID", humanoidSprites);
        }
        for (int i = 0; i < 5000; i++) {
            Sprites roboticDogSprites = new Sprites();
            Robot roboticDog = new Robot(x + i, y + i, "ROBOTIC_DOGS", roboticDogSprites);
        }
        // Huge Memory Consumption to reduce the memory we'll using flyweight pattern
    }
}
