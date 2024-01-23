package com.designpattern.learningdesignpattern.structural.CompositePattern.ProblemStatement;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
    
}
