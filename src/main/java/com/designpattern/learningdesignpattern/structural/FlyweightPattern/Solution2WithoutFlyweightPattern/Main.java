package com.designpattern.learningdesignpattern.structural.FlyweightPattern.Solution2WithoutFlyweightPattern;

class Character {
    char character;
    String fontType;
    int size;
    int row;
    int column;

    public Character(char character, String fontType, int size, int row, int column) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
        this.row = row;
        this.column = column;
    }

    // all getter and setters
}

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        /*
         * this is the data we want to write in word processor
         * total: 58 character
         * t= 7 times;
         * h= 3 times
         * a=3 times and so on...
         */

        Character character1 = new Character('r', "Arial", 10, 0, 0);
        Character character2 = new Character('t', "Arial", 10, 0, 1);
        Character character3 = new Character('h', "Arial", 10, 0, 2);
        Character character4 = new Character('c', "Arial", 10, 0, 3);
    }
}
