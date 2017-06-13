package com.sean;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    } //constructor

    public String plot() {
        return "No plot here";
    }   //method for "plots"

    public String getName() {
        return name;
    }           //getter for random movies
}

class Jaws extends Movie {                  //inherited Movie
    public Jaws() {
        super("Jaws");
    }   //initializing name field

    public String plot() {
        return "A shark eats lots of people";
    }   //
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    } //method override
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method, uses the plot method in the Movie class
}


public class Main {

    public static void main(String[] args) {
        for(int i=1; i<11; i++) {
            Movie movie = randomMovie();                    //created object to pass a "random" movie through it
            System.out.println("Movie #" + i +              //
                    " : " + movie.getName() + "\n" +        //
                    "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie() {                     //method for returning a random movie (random number gen)
        int randomNumber = (int) (Math.random() * 5) +1;    //cast to int because Math.random is a double (returns # 0-1)
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {                             //assigns each movie to a number (like picking them out of a hat)
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;                                        //other random numbers will be generated and must be disregarded







    }


}
