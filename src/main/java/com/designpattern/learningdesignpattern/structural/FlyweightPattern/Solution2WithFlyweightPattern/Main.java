package com.designpattern.learningdesignpattern.structural.FlyweightPattern.Solution2WithFlyweightPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("");

        /*
         * this is the data we want to write into the word processor.
         * 
         * Total = 58 characters
         * t = 7 times
         * h = 3 times
         * a = 3 times and so on...
         * 
         */

        ILetter object1 = LetterFactory.crateLetter('t');
        object1.display(0, 0);

        ILetter object2 = LetterFactory.crateLetter('t');
        object1.display(0, 6);

    }
}
